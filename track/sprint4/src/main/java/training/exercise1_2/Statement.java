package training.exercise1_2;

import java.time.LocalDate;

/**
 * Interface representing a customer's bank statement data structure
 */
public interface Statement {
    /**
     * @return the unique account number associated with this statement
     */
    String getAccountNumber();

    /**
     * @return the customer's full name
     */
    String getCustomerName();

    /**
     * @return the starting date for this statement period
     */
    LocalDate getStartDate();

    /**
     * @return the ending date for this statement period
     */
    LocalDate getEndDate();

    /**
     * Formats the statement contents into a human-readable string.
     *
     * @return the formatted statement text to be delivered
     */
    String formatStatementContent();
}
