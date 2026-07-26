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

    public double getOutstandingRentalCount() {
        return rentals.stream().filter(r -> !r.isPaid()).count();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=============================================\n");
        sb.append("               RENTAL SUMMARY                \n");
        sb.append("=============================================\n");
        sb.append(String.format("Customer Name: %s\n", contract.getCustomerName()));
        sb.append(String.format("Customer Age: %d\n", contract.getCustomerAge()));
        sb.append(String.format("Contract Dates: %s to %s\n", contract.getCustomerName()));
        sb.append("----------------------------------------------\n");
        sb.append(String.format("%-15s | %-12s |  %-12s |  %-8s\n", "Due Date", "Capital", "Interest", "Status"));
        sb.append("----------------------------------------------\n");

        for (Rental r : rentals) {
            sb.append(String.format("%-15s | £%-11.2f |  £%-11.2f |  %-8s\n", r.getDueDate(), r.getCapitalAmount(), r.getInterestAmount(), r.isPaid() ? "PAID" : "DUE"));
        }
        sb.append("----------------------------------------------\n");
        Rental next = getNextDueRental();
        sb.append(String.format("Next Due Rental         :%s\n", next != null ? next.getDueDate() : "None (All Paid)"));
        sb.append(String.format("Total Capital           :£%.2f\n", getTotalCapital()));
        sb.append(String.format("Total Interest           :£%.2f\n", getTotalInterest()));
        sb.append(String.format("Total Interest           :%d\n", getOutstandingRentalCount()));
        sb.append("=============================================\n");

        return sb.toString();
    }
}
