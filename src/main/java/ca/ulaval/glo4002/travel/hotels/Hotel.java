package ca.ulaval.glo4002.travel.hotels;

import ca.ulaval.glo4002.travel.passengers.Passenger;

public class Hotel {
    private double price;

    public Hotel(double price) {
        this.price = price;
    }

    public double calculatePrice() {
        return price;
    }

    public double calculatePrice(Passenger requester) {
        return requester.applyHotelRebate(price);
    }
}
