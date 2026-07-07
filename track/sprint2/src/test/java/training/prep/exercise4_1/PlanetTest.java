package training.prep.exercise4_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {
    @Test
    public void shouldPrintTheExactNumberOfPlanetCount() {
        Planet earth = new Planet("Earth");
        Planet mars = new Planet("Mars");
        Planet jupiter = new Planet("Jupiter");
        assertEquals(Planet.getPlanetCount(), 3);

        // What happens when you print earth.getPlanetCount(), why is this confusing?
        // getPlanetCount() is not accessible on the instances of the class because
        // it is static method which means it is only accessible at the class level.
    }
}