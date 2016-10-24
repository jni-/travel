package ca.ulaval.glo4002.travel.flights;

import ca.ulaval.glo4002.travel.passengers.Passenger;

public class PartnerFlight implements Flight {

    private double flightPrice;

    public PartnerFlight(double basePrice) {
        flightPrice = basePrice;
    }

    @Override
    public double calculatePrice(Passenger[] passengers) {
        return passengers.length * flightPrice;

    }

    @Override
    public double calculatePriceForAgency(Passenger[] passengers) {
        return passengers.length * flightPrice;
    }

}
