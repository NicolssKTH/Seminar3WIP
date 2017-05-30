package test.kth.iv1350.inspectcar.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import se.kth.iv1350.inspectcar.integration.CreditCard;
import se.kth.iv1350.inspectcar.model.CardPayment;

import static org.junit.Assert.*;

/**
 * Created by Röglas on 2017-05-04.
 */
public class CardPaymentTest {
    private CreditCard card;
    private CardPayment cP;
    private double amount;

    @Before
    public void setUp() throws Exception {
        amount = 2500;
        card = new CreditCard(2156, "6324524651488574", "Karl Karlsson", "2018-10", 542);
        cP = new CardPayment(card, amount);
    }

    @After
    public void tearDown() throws Exception {
        amount = 0;
        card = null;
        cP = null;
    }

    @Test
    public void testAuthentication() throws Exception {
        boolean expResult = true;
        boolean result = cP.Authentication(card, amount);
        assertEquals("Wrong authentication were found", expResult, result);
    }

}