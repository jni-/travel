package ca.ulaval.glo4002.travel.passengers;

public class VipPassenger implements Passenger {

    private static final double VIP_REBATE = 0.8;

    @Override
    public double applyHotelRebate(double price) {
        return price * VIP_REBATE;
    }

    @Override
    public double applyFlightRebate(double price) {
        return price * VIP_REBATE;
    }

    @Override
    public double applyCharterFlightRebate(double price) {
        return price * DEFAULT_CHARTER_REBATE;
    }

}
