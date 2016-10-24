package ca.ulaval.glo4002.travel.flights;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import ca.ulaval.glo4002.travel.passengers.Passenger;

public class PartnerFlightTest {

    private static final double DELTA = 0.01;
    private static final double BASE_PRICE = 167.11;

    private Passenger passenger1;
    private Passenger passenger2;

    private PartnerFlight flight;

    @Before
    public void setUp() {
        passenger1 = mock(Passenger.class);
        passenger2 = mock(Passenger.class);
        flight = new PartnerFlight(BASE_PRICE);
    }

    @Test
    public void calculatePriceIsTheBasePriceForEveryone() {
        double price = flight.calculatePrice(new Passenger[]{passenger1, passenger2});

        assertEquals(BASE_PRICE * 2, price, DELTA);
    }

    @Test
    public void calculatePriceForAgenciesIsTheBasePriceForEveryone() {
        double price = flight.calculatePriceForAgency(new Passenger[]{passenger1, passenger2});

        assertEquals(BASE_PRICE * 2, price, DELTA);
    }
}
