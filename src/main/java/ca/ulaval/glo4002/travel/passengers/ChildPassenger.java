package ca.ulaval.glo4002.travel.passengers;

public class ChildPassenger implements Passenger {

    private static final double STANDARD_FLIGHT_REBATE = 0.6;
    private static final double CHARTER_FLIGHT_REBATE = 0.95;

    @Override
    public double applyHotelRebate(double price) {
        return price;
    }

    @Override
    public double applyFlightRebate(double price) {
        return price * STANDARD_FLIGHT_REBATE;
    }

    @Override
    public double applyCharterFlightRebate(double price) {
        return price * CHARTER_FLIGHT_REBATE;
    }

}
