package training.exercise1_2;

import training.exercise1_1.StatementDeliveryService;
import training.exercise1_1.StatementSender;

import java.time.LocalDate;

public class StatementService {
    private final StatementDeliveryService deliveryService;

    public StatementService(StatementDeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public boolean sendAllTransactionsStatement(String accNo, String name, LocalDate startDate, LocalDate endDate, StatementSender sender) {
        Statement statement = new AllTransactionsMonthlyStatement(accNo, name, startDate, endDate);
        return deliveryService.deliverStatement(statement, sender);
    }

    public boolean sendOutgoingTransactionsStatement(String accNo, String name, LocalDate startDate, LocalDate endDate, StatementSender sender) {
        Statement statement = new OutgoingTransactionsMonthlyStatement(accNo, name, startDate, endDate);
        return deliveryService.deliverStatement(statement, sender);
    }
}
