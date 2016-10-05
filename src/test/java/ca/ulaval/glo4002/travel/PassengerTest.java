package ca.ulaval.glo4002.travel;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PassengerTest {
    private static final boolean IS_VIP = true;
    private static final boolean IS_CHILD = true;

    private Passenger passager;

    @Before
    public void setup() {
        passager = new Passenger(IS_VIP, IS_CHILD);
    }

    @Test
    public void shouldBeVIP() {
        assertTrue(passager.isVIP());
    }

    @Test
    public void shouldBeChild() {
        assertTrue(passager.isChild());
    }

    @Test
    public void aChildIsNotAnAdult() {
        assertFalse(passager.isAdult() == passager.isChild());
    }

    @Test
    public void VIPRebateIsDefinedByDefault() {
        assertTrue(passager.getVIPRebate() > 0.001);
    }

    @Test
    public void childRebateDefinedByDefault() {
        assertTrue(passager.getChildRebate() > 0.001);
    }
}
