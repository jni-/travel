package ca.ulaval.glo4002.travel.quotes;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import ca.ulaval.glo4002.travel.flights.Flight;
import ca.ulaval.glo4002.travel.hotels.Hotel;
import ca.ulaval.glo4002.travel.passengers.Passenger;

public class AgencyQuoteTest {

    private static final double DELTA = 0.01;

    private Passenger[] passengers;
    private Flight flight;
    private Hotel hotel;

    private AgencyQuote quote;

    @Before
    public void setUp() {
        passengers = new Passenger[]{};
        flight = mock(Flight.class);
        hotel = mock(Hotel.class);

        quote = new AgencyQuote(passengers);
        quote.addFlight(flight);
        quote.addHotel(hotel);
    }

    @Test
    public void appliesA95PercentRebateOnTheFlightPrice() {
        double totalFlightPrice = 1285.15;
        willReturn(totalFlightPrice).given(flight).calculatePriceForAgency(passengers);

        Invoice invoice = quote.generateInvoice();

        assertEquals(totalFlightPrice * 0.95, invoice.getTotal(), DELTA);
    }

    @Test
    public void appliesA95PercentRebateOnTheHotelPrice() {
        double hotelPrice = 543.92;
        willReturn(hotelPrice).given(hotel).calculatePrice();

        Invoice invoice = quote.generateInvoice();

        assertEquals(hotelPrice * 0.95, invoice.getTotal(), DELTA);
    }

}
