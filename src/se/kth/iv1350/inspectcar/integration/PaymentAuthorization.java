package se.kth.iv1350.inspectcar.integration;

/**
 * Created by Röglas on 2017-05-03.
 */
public class PaymentAuthorization {

    /*
    * Dummy implementation of an authentication service that always returns true.
    * */
    public boolean authorizePayment(CreditCard card, double amount) {
        return true;
    }

}
