package ca.ulaval.glo4002.travel.flights;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import ca.ulaval.glo4002.travel.passengers.Passenger;

public class StandardFlightTest {

    private static final double DELTA = 0.01;
    private static final double BASE_PRICE = 854.84;

    private Passenger passenger1;
    private Passenger passenger2;

    private StandardFlight flight;

    @Before
    public void setUp() {
        passenger1 = mock(Passenger.class);
        passenger2 = mock(Passenger.class);
        flight = new StandardFlight(BASE_PRICE);
    }

    @Test
    public void calculatePriceAppliesNormalFlightRebateForAllPassengers() {
        double passenger1PriceAfterRebate = setRebate(passenger1, 0.80);
        double passenger2PriceAfterRebate = setRebate(passenger2, 0.85);

        double price = flight.calculatePrice(new Passenger[]{passenger1, passenger2});

        assertEquals(passenger1PriceAfterRebate + passenger2PriceAfterRebate, price, DELTA);
    }

    @Test
    public void calculatePriceForAgenciesDoesNotUseThePassengerRebates() {
        setRebate(passenger1, 0.8);
        setRebate(passenger2, 0.8);

        double price = flight.calculatePriceForAgency(new Passenger[]{passenger1, passenger2});

        assertEquals(BASE_PRICE * 2, price, DELTA);
    }

    private double setRebate(Passenger passenger, double rebatePercentage) {
        double newPrice = BASE_PRICE * rebatePercentage;
        willReturn(newPrice).given(passenger).applyFlightRebate(BASE_PRICE);
        return newPrice;
    }
}
