package ca.ulaval.glo4002.travel;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FlightTest {
    private static final double PRICE = 42.42;
    private static final double DELTA = 0.01;

    private Flight flight;

    @Before
    public void setup() {
        flight = new Flight(PRICE, true);
    }

    @Test
    public void getPriceShouldReturnPrice() {
        assertEquals(PRICE, flight.getPrice(), DELTA);
    }

    @Test
    public void shouldReturnIsPartner() {
        assertTrue(flight.isFlightFromPartnerCompany());
    }

    @Test
    public void shouldNotBePartner() {
        flight = new Flight(PRICE, false);
        assertFalse(flight.isFlightFromPartnerCompany());
    }
}
