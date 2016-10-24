package ca.ulaval.glo4002.travel.passengers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StandardPassengerTest {

    private static final double DELTA = 0.01;

    private StandardPassenger standardPassenger;

    @Before
    public void setUp() {
        standardPassenger = new StandardPassenger();
    }

    @Test
    public void standardPassengerHasNoRebateOnHotels() {
        double hotelPrice = 1212.12;

        double priceAfterRebate = standardPassenger.applyHotelRebate(hotelPrice);

        assertEquals(hotelPrice, priceAfterRebate, DELTA);
    }

    @Test
    public void standardPassengerHasNoRebateOnNormalFlights() {
        double flightPrice = 1000;

        double priceAfterRebate = standardPassenger.applyFlightRebate(flightPrice);

        assertEquals(flightPrice, priceAfterRebate, DELTA);
    }

    @Test
    public void standardPassengerHas85PercentRebateOnCharterFlights() {
        double flightPrice = 1125;

        double priceAfterRebate = standardPassenger.applyCharterFlightRebate(flightPrice);

        assertEquals(flightPrice * 0.85, priceAfterRebate, DELTA);
    }
}
