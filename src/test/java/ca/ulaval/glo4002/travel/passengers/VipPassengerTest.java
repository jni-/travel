package ca.ulaval.glo4002.travel.passengers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VipPassengerTest {

    private static final double DELTA = 0.01;

    private VipPassenger vipPassenger;

    @Before
    public void setUp() {
        vipPassenger = new VipPassenger();
    }

    @Test
    public void vipPassengerHas80PercentRebateOnHotel() {
        double hotelPrice = 1212.12;

        double priceAfterRebate = vipPassenger.applyHotelRebate(hotelPrice);

        assertEquals(hotelPrice * 0.8, priceAfterRebate, DELTA);
    }

    @Test
    public void vipPassengerHas80PercentRebateOnNormalFlights() {
        double flightPrice = 1000;

        double priceAfterRebate = vipPassenger.applyFlightRebate(flightPrice);

        assertEquals(flightPrice * 0.8, priceAfterRebate, DELTA);
    }

    @Test
    public void vipPassengerHas85PercentRebateOnCharterFlights() {
        double flightPrice = 1125;

        double priceAfterRebate = vipPassenger.applyCharterFlightRebate(flightPrice);

        assertEquals(flightPrice * 0.85, priceAfterRebate, DELTA);
    }

}
