package training.rental_summary_generator;

import java.time.LocalDate;

public class Rental {
    private LocalDate dueDate;
    private double CapitalAmount;
    private double interestAmount;
    private boolean paid;

    public Rental(LocalDate dueDate, double capitalAmount, double interestAmount, boolean paid) {
        this.dueDate = dueDate;
        CapitalAmount = capitalAmount;
        this.interestAmount = interestAmount;
        this.paid = paid;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public double getCapitalAmount() {
        return CapitalAmount;
    }

    public double getInterestAmount() {
        return interestAmount;
    }

    public boolean isPaid() {
        return paid;
    }
}
