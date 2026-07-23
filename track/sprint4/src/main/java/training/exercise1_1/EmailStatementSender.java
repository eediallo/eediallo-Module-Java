package training.exercise1_1;

import training.exercise1_2.Statement;

import javax.swing.plaf.nimbus.State;

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

    @Override
    public boolean sendStatement(Statement statement) {
        return sendStatement(statement.formatStatementContent());
    }
}
