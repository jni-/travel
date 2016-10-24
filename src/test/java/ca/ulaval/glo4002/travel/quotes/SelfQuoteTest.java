package ca.ulaval.glo4002.travel.quotes;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import ca.ulaval.glo4002.travel.flights.Flight;
import ca.ulaval.glo4002.travel.hotels.Hotel;
import ca.ulaval.glo4002.travel.passengers.Passenger;

public class SelfQuoteTest {

    private static final double DELTA = 0.01;

    private Passenger[] passengers;
    private Passenger requester;
    private Flight flight;
    private Hotel hotel;

    private SelfQuote quote;

    @Before
    public void setUp() {
        passengers = new Passenger[]{};
        requester = mock(Passenger.class);
        flight = mock(Flight.class);
        hotel = mock(Hotel.class);

        quote = new SelfQuote(requester, passengers);
        quote.addFlight(flight);
        quote.addHotel(hotel);
    }

    @Test
    public void appliesAllThePassengersRebatesOnTheFlight() {
        double totalFlightPrice = 1285.15;
        willReturn(totalFlightPrice).given(flight).calculatePrice(passengers);

        Invoice invoice = quote.generateInvoice();

        assertEquals(totalFlightPrice, invoice.getTotal(), DELTA);
    }

    @Test
    public void appliesTheRequestersRebateOnTheHotelPrice() {
        double hotelPrice = 543.92;
        willReturn(hotelPrice).given(hotel).calculatePrice(requester);

        Invoice invoice = quote.generateInvoice();

        assertEquals(hotelPrice, invoice.getTotal(), DELTA);
    }
}
