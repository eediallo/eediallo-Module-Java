package training.exercise1_1;

/**
 * Interface representing a delivery mechanism for customer bank statements.
 * <p>
 * Implementations define the underlying protocol (e.g., email, letter) used to
 * dispatch statement content to customers
 */
public interface StatementSender {

    /**
     * Dispatches he provided bank statement content to a customer via specific delivery channel.
     *
     * @param statementContent the body of the statement to deliver
     * @return {@code true} if the statement was successfully delivered; {@code false} otherwise
     */
    boolean sendStatement(String statementContent);
}



