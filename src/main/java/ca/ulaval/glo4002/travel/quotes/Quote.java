package ca.ulaval.glo4002.travel.quotes;

import ca.ulaval.glo4002.travel.flights.Flight;
import ca.ulaval.glo4002.travel.hotels.Hotel;
import ca.ulaval.glo4002.travel.passengers.Passenger;

public abstract class Quote {

    private Passenger[] passengers = new Passenger[]{};
    private Flight flight;
    private Hotel hotel;

    public Quote(Passenger[] passengers) {
        this.passengers = passengers;
    }

    public void addFlight(Flight flight) {
        this.flight = flight;
    }

    public void addHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Invoice generateInvoice() {
        Invoice invoice = new Invoice();
        invoice.setFlightPrice(calculateFlightPrice());
        invoice.setHotelPrice(calculateHotelPrice());
        return invoice;
    }

    protected Passenger[] getPassengers() {
        return passengers;
    }

    protected Flight getFlight() {
        return flight;
    }

    protected Hotel getHotel() {
        return hotel;
    }

    protected abstract double calculateFlightPrice();

    protected abstract double calculateHotelPrice();
}
