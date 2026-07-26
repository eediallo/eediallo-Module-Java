package training.rental_summary_generator;

import java.time.LocalDate;

public class Contract {
    private String customerName;
    private int customerAge;
    private LocalDate startDate;
    private double carePrice;
    private int contractLengthYears;

    public Contract(String customerName, int customerAge, LocalDate startDate, int contractLengthYears, double carePrice) {
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.startDate = startDate;
        if (contractLengthYears != 1 && contractLengthYears != 3) {
            throw new IllegalArgumentException("Contract length must be either 1 or 3");
        }
        this.contractLengthYears = contractLengthYears;
        if (carePrice <= 0) {
            throw new IllegalArgumentException("Car price must be positive");
        }
        this.carePrice = carePrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public double getCarePrice() {
        return carePrice;
    }

    public int getContractLengthYears() {
        return contractLengthYears;
    }
}

