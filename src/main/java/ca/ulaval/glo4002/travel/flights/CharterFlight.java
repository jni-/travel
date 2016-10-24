package ca.ulaval.glo4002.travel.flights;

import ca.ulaval.glo4002.travel.passengers.Passenger;

public class CharterFlight implements Flight {

    private double flightPrice;

    public CharterFlight(double basePrice) {
        flightPrice = basePrice;
    }

    @Override
    public double calculatePrice(Passenger[] passengers) {
        double price = 0;
        for (Passenger passenger : passengers) {
            price += passenger.applyCharterFlightRebate(flightPrice);
        }
        return price;
    }

    @Override
    public double calculatePriceForAgency(Passenger[] passengers) {
        return passengers.length * flightPrice;
    }

}
