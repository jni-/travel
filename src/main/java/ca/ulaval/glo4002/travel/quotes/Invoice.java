package ca.ulaval.glo4002.travel.quotes;

public class Invoice {

    private double flightPrice;
    private double hotelPrice;

    public void setFlightPrice(double flightPrice) {
        this.flightPrice = flightPrice;
    }

    public void setHotelPrice(double hotelPrice) {
        this.hotelPrice = hotelPrice;
    }

    public double getTotal() {
        return flightPrice + hotelPrice;
    }

}
