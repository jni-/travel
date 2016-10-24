package ca.ulaval.glo4002.travel.passengers;

public class SeniorPassenger implements Passenger {

    private static final double SENIOR_REBATE = 0.9;

    @Override
    public double applyHotelRebate(double price) {
        return price * SENIOR_REBATE;
    }

    @Override
    public double applyFlightRebate(double price) {
        return price * SENIOR_REBATE;
    }

    @Override
    public double applyCharterFlightRebate(double price) {
        return price * DEFAULT_CHARTER_REBATE;
    }

}
