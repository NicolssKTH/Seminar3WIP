package se.kth.iv1350.inspectcar.model;

/**
 * Created by Röglas on 2017-05-03.
 */
public class Display {
    private int queueNumber;

    /**
    * Constructor
    */
    public int getQueueNumber() {
        return queueNumber;
    }

    /**
    * Iterates the queueNumber +1 everytime it's called.
    */
    public void incrementNumber() {
        queueNumber = queueNumber + 1;
    }


}
