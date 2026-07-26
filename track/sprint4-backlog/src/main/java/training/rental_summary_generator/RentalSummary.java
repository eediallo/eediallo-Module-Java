package training.rental_summary_generator;

import java.util.Comparator;
import java.util.List;

public class RentalSummary {
    private List<Rental> rentals;
    private Contract contract;

    public RentalSummary(List<Rental> rentals, Contract contract) {
        // keep rentals sorted by due date
        rentals.sort(Comparator.comparing(Rental::getDueDate));
        this.rentals = rentals;

        this.contract = contract;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public Contract getContract() {
        return contract;
    }

    public Rental getNextDueRental() {
        return rentals.stream().filter(r -> !r.isPaid()).findFirst().orElse(null);
    }

    public double getTotalCapital() {
        return rentals.stream().mapToDouble(Rental::getCapitalAmount).sum();
    }

    public double getTotalInterest() {
        return rentals.stream().mapToDouble(Rental::getInterestAmount).sum();
    }
}
