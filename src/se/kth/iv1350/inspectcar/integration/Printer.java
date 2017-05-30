package se.kth.iv1350.inspectcar.integration;

import se.kth.iv1350.inspectcar.model.Result;

/**
 * Created by Röglas on 2017-05-03.
 */

public class Printer {
    /**
     * Prints the cost of the inspections as the receipt.
     * @param cost the cost for the inspection.
     */
    public void printReceipt(double cost) {
        System.out.println("Receipt: " + cost);
    }

    /**
     * Prints the message
     * @param s is the message
     */
    public void print(String s) {
        System.out.println(s);
    }

    /**
     * Prints the name of an inspection.
     * @param inspection the inspection registry
     */

    public void PrintResult(InspectionRegistry inspection) {
        System.out.println(inspection.getName());

    }
}
