package ca.ulaval.glo4002.travel;

public class HotelReservation {
    public void generateQuote(Hotel hotel, Quote quote) {
        double price = 0.0;

        Passenger requester = quote.getRequester();
        if (requester.isVIP() && requester.isAdult()) {
            price += hotel.getPrice() * requester.getVIPRebate();
        } else {
            price += hotel.getPrice();
        }

        quote.setHotelPrice(price);
    }
}
