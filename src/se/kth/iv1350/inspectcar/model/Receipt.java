package se.kth.iv1350.inspectcar.model;

import se.kth.iv1350.inspectcar.integration.InspectionRegistry;
import se.kth.iv1350.inspectcar.integration.Printer;

import java.util.List;

/**
 * Created by Röglas on 2017-05-03.
 */
public class Receipt {
    private Printer printer;

    /**
    * Constructor
    */
    public Receipt(){
        this.printer = new Printer();
    }

    /**
    * Sends the receipt to the printer which prints it out.
     * @param cost The cost of the inspections.
    */
    public void SendReceipt(double cost){
        printer.printReceipt(cost);
    }

}

