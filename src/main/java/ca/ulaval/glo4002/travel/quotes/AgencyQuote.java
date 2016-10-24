package ca.ulaval.glo4002.travel.quotes;

import ca.ulaval.glo4002.travel.passengers.Passenger;

public class AgencyQuote extends Quote {

    private static final double AGENCY_REBATE = 0.95;

    public AgencyQuote(Passenger[] passengers) {
        super(passengers);
    }

    @Override
    protected double calculateFlightPrice() {
        return getFlight().calculatePriceForAgency(getPassengers()) * AGENCY_REBATE;
    }

    @Override
    protected double calculateHotelPrice() {
        return getHotel().calculatePrice() * AGENCY_REBATE;
    }

}
