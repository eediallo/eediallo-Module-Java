package training.exercise1_2;

import java.time.LocalDate;

public class OutgoingTransactionsMonthlyStatement implements Statement {
    private final String accountNumber;
    private final String customerName;
    private final LocalDate startDate;
    private final LocalDate endDate;

    public OutgoingTransactionsMonthlyStatement(String accountNumber, String customerName, LocalDate startDate, LocalDate endDate) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getCustomerName() {
        return customerName;
    }

    @Override
    public LocalDate getStartDate() {
        return startDate;
    }

    @Override
    public LocalDate getEndDate() {
        return endDate;
    }

    @Override
    public String formatStatementContent() {
        return String.format("====FULL MONTHLY STATEMENT ====\nAccount: %s | Customer: %s\nPeriod: %s to %s\nTransactions: [Outgoing ONLY - Ingoing excluded]", accountNumber, customerName, startDate, endDate);
    }
}
