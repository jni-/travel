package ca.ulaval.glo4002.travel.flights;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import ca.ulaval.glo4002.travel.passengers.Passenger;

public class CharterFlightTest {

    private static final double DELTA = 0.01;
    private static final double BASE_PRICE = 1251.21;

    private Passenger passenger1;
    private Passenger passenger2;

    private CharterFlight flight;

    @Before
    public void setUp() {
        passenger1 = mock(Passenger.class);
        passenger2 = mock(Passenger.class);
        flight = new CharterFlight(BASE_PRICE);
    }

    @Test
    public void calculatePriceAppliesCharterRebateForAllPassengers() {
        double passenger1PriceAfterRebate = setRebate(passenger1, 0.90);
        double passenger2PriceAfterRebate = setRebate(passenger2, 0.95);

        double price = flight.calculatePrice(new Passenger[]{passenger1, passenger2});

        assertEquals(passenger1PriceAfterRebate + passenger2PriceAfterRebate, price, DELTA);
    }

    @Test
    public void calculatePriceForAgenciesDoesNotUseThePassengerRebates() {
        setRebate(passenger1, 0.9);
        setRebate(passenger2, 0.9);

        double price = flight.calculatePriceForAgency(new Passenger[]{passenger1, passenger2});

        assertEquals(BASE_PRICE * 2, price, DELTA);
    }

    private double setRebate(Passenger passenger, double rebatePercentage) {
        double newPrice = BASE_PRICE * rebatePercentage;
        willReturn(newPrice).given(passenger).applyCharterFlightRebate(BASE_PRICE);
        return newPrice;
    }

}
