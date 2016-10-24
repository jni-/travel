package ca.ulaval.glo4002.travel.passengers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SeniorPassengerTest {

    private static final double DELTA = 0.01;

    private SeniorPassenger seniorPassenger;

    @Before
    public void setUp() {
        seniorPassenger = new SeniorPassenger();
    }

    @Test
    public void seniorPassengerHas90PercentRebateOnHotel() {
        double hotelPrice = 1212.12;

        double priceAfterRebate = seniorPassenger.applyHotelRebate(hotelPrice);

        assertEquals(hotelPrice * 0.9, priceAfterRebate, DELTA);
    }

    @Test
    public void seniorPassengerHas90PercentRebateOnNormalFlights() {
        double flightPrice = 1000;

        double priceAfterRebate = seniorPassenger.applyFlightRebate(flightPrice);

        assertEquals(flightPrice * 0.9, priceAfterRebate, DELTA);
    }

    @Test
    public void seniorPassengerHas85PercentRebateOnCharterFlights() {
        double flightPrice = 1125;

        double priceAfterRebate = seniorPassenger.applyCharterFlightRebate(flightPrice);

        assertEquals(flightPrice * 0.85, priceAfterRebate, DELTA);
    }
}
