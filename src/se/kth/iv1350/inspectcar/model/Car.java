package se.kth.iv1350.inspectcar.model;

/**
 * Created by Röglas on 2017-05-03.
 */
public class Car {
    private String registrationNr;

    /**
    * Constructor
    */
    public Car(String registrationNr) {
        this.registrationNr = registrationNr;
    }

    /**
    * Getter
    */
    public String getRegNo(){
        return registrationNr;
    }
}
