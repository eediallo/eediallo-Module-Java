package training.exercise1_1;

/**
 * Handles bank statement via Email.
 */
public class EmailStatementSender implements StatementSender {

    /**
     * Sends statement to customer via email.
     *
     * @param statementContent the body of the statement
     * @return {@code true}* indicating email dispatch success
     */
    @Override
    public boolean sendStatement(String statementContent) {
        System.out.println("[EMAIL SENT]: " + statementContent);
        return true;
    }
}
