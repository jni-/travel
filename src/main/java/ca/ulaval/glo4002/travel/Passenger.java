package ca.ulaval.glo4002.travel;

public class Passenger {

    private static final double VIP_REBATE = 0.8;
    private static final double CHILD_REBATE = 0.6;

    private boolean isVip;
    private boolean isChild;

    public Passenger(boolean isVip, boolean isChild) {
        this.isVip = isVip;
        this.isChild = isChild;
    }

    public boolean isVIP() {
        return isVip;
    }

    public boolean isChild() {
        return isChild;
    }

    public boolean isAdult() {
        return !isChild;
    }

    public double getVIPRebate() {
        return VIP_REBATE;
    }

    public double getChildRebate() {
        return CHILD_REBATE;
    }
}
