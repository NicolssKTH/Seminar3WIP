package se.kth.iv1350.inspectcar.model;

import se.kth.iv1350.inspectcar.integration.DBManager;

/**
 * Created by Röglas on 2017-05-03.
 */
public class Garage {

    private boolean door;
    private Result result;
    private Display display;

    public Garage(DBManager dbMgr){
        this.result = new Result(dbMgr);
        this.display = new Display();
    }

    /**
    * newCustomer increases number on display, resets the max amount of inspections and opens the garagedoor.
    */
    public void newCustomer() {
        display.incrementNumber();
        System.out.println("Queuenumber: " + display.getQueueNumber());
        result.index = -1;
        openDoor();
    }
    /**
    * Closes door
    */
    public boolean closeDoor(){
        door = false;
        System.out.println("Door: closed");
        return door;
    }
    /**
    * Opens door
    */
    public boolean openDoor(){
        door = true;
        System.out.println("Door: open");
        return door;
    }

}
