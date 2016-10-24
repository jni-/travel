package ca.ulaval.glo4002.travel.passengers;

public interface Passenger {

    static final double DEFAULT_CHARTER_REBATE = 0.85;

    double applyHotelRebate(double price);

    double applyFlightRebate(double price);

    double applyCharterFlightRebate(double price);

}
