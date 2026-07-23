package training.exercise1_2;

import java.time.LocalDate;

public interface Statement {
    String getAccountNumber();

    String getCustomerName();

    LocalDate getStartDate();

    LocalDate getEndDate();

    String formatStatementContent();
}
