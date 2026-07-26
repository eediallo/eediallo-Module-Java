package training.rental_summary_generator;

import java.time.LocalDate;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Contract oneYearContract = new Contract("John Smith", 25, LocalDate.of(2025, 8, 12), 1, 10000);

        // two year contract must throw since it is not supported
        Contract twoYearContract = null;
        try {
            twoYearContract = new Contract("Michael Jones", 56, LocalDate.of(2025, 12, 12), 2, 20000);
        } catch (IllegalArgumentException e) {
            System.out.println("[HANDLED EXPECTED ERROR]: " + e.getMessage() + "\n");
        }

        Contract threeYearContract = new Contract("Jane Doe", 77, LocalDate.of(2024, 4, 1), 3, 50000);
        Contract completedContract = new Contract("Rosie Parker", 47, LocalDate.of(2021, 7, 10), 3, 40000);

        RentalSummaryService rentalSummaryService = new RentalSummaryService();

        System.out.println("---------------1-YEAR-CONTRACT--------------");
        rentalSummaryService.printRentalSummary(oneYearContract);

        if (twoYearContract != null) {
            System.out.println("------------2-YEAR-CONTRACT---------------");
            rentalSummaryService.printRentalSummary(threeYearContract);
        }


        System.out.println("----------- ----3-YEAR-CONTRACT--------------");
        rentalSummaryService.printRentalSummary(threeYearContract);

        System.out.println("------ ----------Completed contract-------------");
        rentalSummaryService.printRentalSummary(completedContract);
    }
}
