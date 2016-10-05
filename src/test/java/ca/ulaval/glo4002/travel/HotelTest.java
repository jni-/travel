package ca.ulaval.glo4002.travel;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HotelTest {
    private static final double PRICE = 42.42;
    private static final double DELTA = 0.01;

    private Hotel hotel;

    @Before
    public void setup() {
        hotel = new Hotel(PRICE);
    }

    @Test
    public void getPriceShouldReturnPrice() {
        assertEquals(PRICE, hotel.getPrice(), DELTA);
    }
}
