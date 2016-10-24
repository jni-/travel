package ca.ulaval.glo4002.travel.passengers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ChildPassengerTest {

    private static final double DELTA = 0.01;

    private ChildPassenger child;

    @Before
    public void setUp() {
        child = new ChildPassenger();
    }

    @Test
    public void childHasNoRebateOnHotels() {
        double hotelPrice = 1212.12;

        double priceAfterRebate = child.applyHotelRebate(hotelPrice);

        assertEquals(hotelPrice, priceAfterRebate, DELTA);
    }

    @Test
    public void childHas60PercentRebateOnNormalFlights() {
        double flightPrice = 1000;

        double priceAfterRebate = child.applyFlightRebate(flightPrice);

        assertEquals(flightPrice * 0.6, priceAfterRebate, DELTA);
    }

    @Test
    public void childHas95PercentRebateOnCharterFlights() {
        double flightPrice = 1125;

        double priceAfterRebate = child.applyCharterFlightRebate(flightPrice);

        assertEquals(flightPrice * 0.95, priceAfterRebate, DELTA);
    }

}
