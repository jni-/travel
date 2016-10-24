package ca.ulaval.glo4002.travel;

import ca.ulaval.glo4002.travel.flights.Flight;
import ca.ulaval.glo4002.travel.flights.PartnerFlight;
import ca.ulaval.glo4002.travel.hotels.Hotel;
import ca.ulaval.glo4002.travel.passengers.ChildPassenger;
import ca.ulaval.glo4002.travel.passengers.Passenger;
import ca.ulaval.glo4002.travel.passengers.StandardPassenger;
import ca.ulaval.glo4002.travel.passengers.VipPassenger;
import ca.ulaval.glo4002.travel.quotes.Invoice;
import ca.ulaval.glo4002.travel.quotes.Quote;
import ca.ulaval.glo4002.travel.quotes.SelfQuote;

public class SampleMain {
    public static void main(String[] args) {
        Passenger requester = new VipPassenger();
        Passenger passenger1 = new StandardPassenger();
        Passenger passenger2 = new StandardPassenger();
        Passenger passenger3 = new ChildPassenger();

        Hotel hotel = new Hotel(964.35);
        Flight flight = new PartnerFlight(473.01);

        Quote quote = new SelfQuote(requester, new Passenger[]{passenger1, passenger2, passenger3});
        quote.addFlight(flight);
        quote.addHotel(hotel);

        Invoice invoice = quote.generateInvoice();

        System.out.println("Total for the quote is " + invoice.getTotal());
    }
}
