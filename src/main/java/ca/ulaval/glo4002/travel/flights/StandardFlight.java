package ca.ulaval.glo4002.travel.flights;

import ca.ulaval.glo4002.travel.passengers.Passenger;

public class StandardFlight implements Flight {

    private double flightPrice;

    public StandardFlight(double basePrice) {
        flightPrice = basePrice;
    }

    @Override
    public double calculatePrice(Passenger[] passengers) {
        double price = 0;
        for (Passenger passenger : passengers) {
            price += passenger.applyFlightRebate(flightPrice);
        }
        return price;
    }

    @Override
    public double calculatePriceForAgency(Passenger[] passengers) {
        return passengers.length * flightPrice;
    }

}
