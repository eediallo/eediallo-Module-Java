package training.rental_summary_generator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OneYearContractRentalGenerator implements RentalCalculator {

    @Override
    public List<Rental> generateRentals(Contract contract) {
        List<Rental> rentals = new ArrayList<>();

        int totalMonths = 12;

        double monthlyCapital = contract.getCarePrice() / totalMonths;
        double monthlyInterest = (contract.getCarePrice() * 0.02) / totalMonths;
        LocalDate today = LocalDate.now();

        for (int i = 0; i < totalMonths; i++) {
            // Rentals are due monthly starting 1 month after the start date
            LocalDate dueDate = contract.getStartDate().plusMonths(i + 1);
            boolean isPaid = !dueDate.isAfter(today);

            rentals.add(new Rental(dueDate, monthlyCapital, monthlyInterest, isPaid));
        }

        return rentals;

    }
}
