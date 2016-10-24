package ca.ulaval.glo4002.travel.hotels;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import ca.ulaval.glo4002.travel.passengers.Passenger;

public class HotelTest {

    private static final double DELTA = 0.01;
    private static final double BASE_PRICE = 1125.88;

    private Passenger requester;

    private Hotel hotel;

    @Before
    public void setUp() {
        requester = mock(Passenger.class);
        hotel = new Hotel(BASE_PRICE);
    }

    @Test
    public void calculatePriceReturnsTheBasePriceIfRequesterIsNotSpecified() {
        double price = hotel.calculatePrice();

        assertEquals(BASE_PRICE, price, DELTA);
    }

    @Test
    public void calculatePRiceAppliesTheRequestersRebateIfSpecified() {
        double priceAfterRebate = BASE_PRICE * 0.9;
        willReturn(priceAfterRebate).given(requester).applyHotelRebate(BASE_PRICE);

        double price = hotel.calculatePrice(requester);

        assertEquals(priceAfterRebate, price, DELTA);
    }

}
