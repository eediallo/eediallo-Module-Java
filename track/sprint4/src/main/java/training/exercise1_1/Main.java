package training.exercise1_1;

import training.exercise1_2.StatementService;

import java.time.LocalDate;

/**Entry point demonstrator for statement deliveries using different channels.*/
public class Main {
    public static void main(String[] args) {
        StatementDeliveryService statementDeliveryService = new StatementDeliveryService();
        StatementService statementService = new StatementService(statementDeliveryService);

        LocalDate start = LocalDate.now().minusMonths(1);
        LocalDate end = LocalDate.now();

        // Send full statement via Email
        statementService.sendAllTransactionsStatement("ACC-12345", "Mic Jones", start, end, new EmailStatementSender());
        System.out.println("==================================================");

        // Send outgoing only statement via letter
        statementService.sendOutgoingTransactionsStatement("ACC-983838", "Barry Jones", start, end, new LetterStatementSender());
    }
}
