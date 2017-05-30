package se.kth.iv1350.inspectcar.integration;

/**
 * Created by Röglas on 2017-05-30.
 */
public class NotifyUser {
    public NotifyUser(){
    }

    /**
     * Prints the message to the view
     * @param s String message that will be printed
     */
    public void notifyView(String s){
            System.out.println(s);
    }

    /**
     * Prints the name of the inspection to the view
     * @param i is the inspection
     */
    public void notifyView(InspectionRegistry i){
            System.out.println(i.getName());
    }
}
