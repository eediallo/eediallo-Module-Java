package training.rental_summary_generator;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class RentalSummaryService {
    private Optional<RentalSummary> generateRentalSummary(Contract contract) {
        RentalCalculator rentalCalculator;

        if (contract.getContractLengthYears() == 1) {
            rentalCalculator = new OneYearContractRentalGenerator();
        } else if (contract.getContractLengthYears() == 3) {
            rentalCalculator = new ThreeYearContractRentalGenerator();
        } else {
            throw new IllegalArgumentException("Unsupported contract length: " + contract.getContractLengthYears() + " years");
        }

        List<Rental> rentals = rentalCalculator.generateRentals(contract);

        // if the current date is after the final rental due date, treat as complete
        LocalDate finalDueDate = rentals.get(rentals.size() - 1).getDueDate();
        if (LocalDate.now().isAfter(finalDueDate)) {
            return Optional.empty();
        }

        return Optional.of(new RentalSummary(rentals, contract));
    }

    public void printRentalSummary(Contract contract) {
        try {
            Optional<RentalSummary> summaryOpt = generateRentalSummary(contract);
            if (summaryOpt.isPresent()) {
                System.out.println(summaryOpt.get());
            } else {
                System.out.println("Contract for: " + contract.getCustomerName() + " is completed. No summary to display.\n");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Error generating summary for: " + contract.getCustomerName() + ": " + e.getMessage() + "\n");
        }
    }
}
