package ca.ulaval.glo4002.travel;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import ca.ulaval.glo4002.travel.Quote;
import ca.ulaval.glo4002.travel.Passenger;

public class QuoteTest {
    private Passenger requester;
    private Passenger otherPassenger;
    private Quote quote;

    @Before
    public void setup() {
        requester = mock(Passenger.class);
        otherPassenger = mock(Passenger.class);
        quote = new Quote(requester);
    }

    @Test
    public void requesterAvailableAfterCreation() {
        assertEquals(requester, quote.getRequester());
    }

    @Test
    public void getPassengersShouldReturnTwo() {
        int nombrePassagers = 2;
        quote.addPassenger(otherPassenger);
        assertEquals(nombrePassagers, quote.getPassengers().size());
    }

    @Test
    public void requesterAvailableAfterAddingPassenger() {
        quote.addPassenger(otherPassenger);
        assertEquals(requester, quote.getRequester());
    }

    @Test
    public void addAddsPassenger() {
        quote.addPassenger(otherPassenger);
        assertTrue(quote.getPassengers().contains(otherPassenger));
    }

}
