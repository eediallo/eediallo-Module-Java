package training.rental_summary_generator;

import java.util.List;

public interface RentalCalculator {
    List<Rental> generateRentals(Contract contract);
}
