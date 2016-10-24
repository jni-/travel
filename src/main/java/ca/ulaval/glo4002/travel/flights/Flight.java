package ca.ulaval.glo4002.travel.flights;

import ca.ulaval.glo4002.travel.passengers.Passenger;

public interface Flight {
    double calculatePrice(Passenger[] passengers);

    double calculatePriceForAgency(Passenger[] allPassengers);
}
