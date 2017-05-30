package test.kth.iv1350.inspectcar.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import se.kth.iv1350.inspectcar.integration.DBManager;
import se.kth.iv1350.inspectcar.model.Display;
import se.kth.iv1350.inspectcar.model.Garage;
import se.kth.iv1350.inspectcar.model.Result;

/**
 * Created by Röglas on 2017-05-04.
 */
public class GarageTest {
    private Display display;
    private Garage garage;

    public GarageTest(DBManager dbMgr){
        this.garage = new Garage(dbMgr);
        this.display = new Display();
    }

    @Test
    public void testQueueNumber() throws Exception {
        int expResult = 1;
        garage.newCustomer();
        int result = display.getQueueNumber();
        assertEquals("Wrong queuenumber were found", expResult, result);
    }
    @Test
    public void testCloseDoor() throws Exception {
        boolean expResult = false;
        boolean result = garage.closeDoor();
        assertEquals("Wrong status on door was found", expResult, result);
    }

    @Test
    public void testOpenDoor() throws Exception {
        boolean expResult = true;
        boolean result = garage.openDoor();
        assertEquals("Wrong status on door was found", expResult, result);
    }

}