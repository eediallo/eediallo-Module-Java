package training.exercise1_1;

/**
 * Core service in charge of handling customer bank deliveries.
 */
public class StatementDeliveryService {

    /**
     * Delivers statement content using the provided delivery service.
     *
     * @param statementContent the statement text to deliver
     * @param statementSender  the specific sender used to execute the delivery
     * @return {@code true} if delivery succeeded; {@code false} otherwise
     */
    public boolean deliverStatement(String statementContent, StatementSender statementSender) {
        return statementSender.sendStatement(statementContent);
    }
}
