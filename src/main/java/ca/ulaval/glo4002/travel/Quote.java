package ca.ulaval.glo4002.travel;

import java.util.ArrayList;
import java.util.List;

public class Quote {
    private static final int REQUESTER_INDEX = 0;

    private List<Passenger> passengers;

    public Quote(Passenger requester) {
        passengers = new ArrayList<Passenger>();
        passengers.add(requester);
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public Passenger getRequester() {
        return passengers.get(REQUESTER_INDEX);
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setFlightPrice(double price) {
        System.out.println("The flight price is " + price + " $");
    }

    public void setHotelPrice(double price) {
        System.out.println("The hotel price is " + price + " $");
    }

}
