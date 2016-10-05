package ca.ulaval.glo4002.travel;

public class SampleMain {
    public static void main(String[] args) {
        Passenger requester = new Passenger(true, false);
        Passenger passenger1 = new Passenger(false, false);
        Passenger passenger2 = new Passenger(false, false);
        Passenger passenger3 = new Passenger(false, true);

        Quote quote = new Quote(requester);
        quote.addPassenger(passenger1);
        quote.addPassenger(passenger2);
        quote.addPassenger(passenger3);

        Hotel hotel = new Hotel(964.35);
        Flight flight = new Flight(473.01, true);

        new HotelReservation().generateQuote(hotel, quote);
        new FlightReservation().generateQuote(flight, quote);
    }
}
