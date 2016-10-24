package ca.ulaval.glo4002.travel.passengers;

public class StandardPassenger implements Passenger {

    @Override
    public double applyHotelRebate(double price) {
        return price;
    }

    @Override
    public double applyFlightRebate(double price) {
        return price;
    }

    @Override
    public double applyCharterFlightRebate(double price) {
        return price * DEFAULT_CHARTER_REBATE;
    }

}
