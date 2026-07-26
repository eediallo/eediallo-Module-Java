package training.rental_summary_generator;

import java.time.LocalDate;

public class Contract {
    private String customerName;
    private String customerAge;
    private LocalDate startDate;
    private double carePrice;
    private int contractLengthYears;

    public Contract(String customerName, String customerAge, LocalDate startDate, double carePrice, int contractLengthYears) {
        if (contractLengthYears == 1 || contractLengthYears == 3) {
            this.contractLengthYears = contractLengthYears;
        }
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.carePrice = carePrice;
        this.startDate = startDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAge() {
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
