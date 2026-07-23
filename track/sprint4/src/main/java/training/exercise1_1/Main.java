package training.exercise1_1;
/**Entry point demonstrator for statement deliveries using different channels.*/
public class Main {
    public static void main(String[] args) {
        StatementDeliveryService statementDeliveryService = new StatementDeliveryService();

        // send via Email
        statementDeliveryService.deliverStatement("Good news! You are now eligible to apply for our investment products.", new EmailStatementSender());
        // send via letter
        statementDeliveryService.deliverStatement("Please be aware of fraud.", new LetterStatementSender());
    }
}
