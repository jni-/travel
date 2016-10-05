package ca.ulaval.glo4002.travel;

public class Flight {
    private double price;
    private boolean isPartnerCompany;

    public Flight(double price, boolean isPartnerCompany) {
        this.price = price;
        this.isPartnerCompany = isPartnerCompany;
    }

    public double getPrice() {
        return price;
    }

    public boolean isFlightFromPartnerCompany() {
        return isPartnerCompany;
    }
}
