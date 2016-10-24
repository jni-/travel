package ca.ulaval.glo4002.travel.quotes;

import ca.ulaval.glo4002.travel.passengers.Passenger;

public class SelfQuote extends Quote {

    private Passenger requester;

    public SelfQuote(Passenger requester, Passenger[] passengers) {
        super(passengers);
        this.requester = requester;
    }

    @Override
    protected double calculateFlightPrice() {
        return getFlight().calculatePrice(getPassengers());
    }

    @Override
    protected double calculateHotelPrice() {
        return getHotel().calculatePrice(requester);
    }

}
