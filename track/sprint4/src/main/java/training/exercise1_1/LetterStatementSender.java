package training.exercise1_1;

import training.exercise1_2.Statement;

/**
 * Handle bank statement delivery via postal service.
 */
public class LetterStatementSender implements StatementSender {

    /**
     * Sends statement to customer via post.
     *
     * @param statementContent the body of the statement
     * @return {@code true}* indicating email dispatch success
     */
    @Override
    public boolean sendStatement(String statementContent) {
        System.out.println("LETTER SENT: " + statementContent);
        return true;
    }

    @Override
    public boolean sendStatement(Statement statement) {
        return sendStatement(statement.formatStatementContent());
    }
}
