package test.kth.iv1350.inspectcar.integration;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import se.kth.iv1350.inspectcar.integration.DBManager;
import se.kth.iv1350.inspectcar.integration.InspectionRegistry;
import se.kth.iv1350.inspectcar.model.Car;

public class TestDBManager {
    DBManager instance;
    Car vehicleToInspect;

    @Before
    public void setUp() {
        String existingRegNo = "ABC123";
        vehicleToInspect = new Car(existingRegNo);
        instance = new DBManager();
    }

    @After
    public void tearDown() {
        instance = null;
        vehicleToInspect = null;
    }

    @Test
    public void testNumberOfFoundInspections() {
        int expResult = 3;
        int result = instance.findInspectionsForCar(vehicleToInspect).size();
        assertEquals("Wrong number of inspection items", expResult, result);
    }

    @Test
    public void testCorrectInspectionsFound() {
        List<InspectionRegistry> expResult = new ArrayList<>();
        expResult.add(new InspectionRegistry("brakes", 10));
        expResult.add(new InspectionRegistry("suspension", 20));
        expResult.add(new InspectionRegistry("stearing", 30));

        List<InspectionRegistry> result = instance.findInspectionsForCar(vehicleToInspect);
        for (int i=0; i<expResult.size(); i++) {
            assertEquals(expResult.get(i), result.get(i));
        }
    }
}
