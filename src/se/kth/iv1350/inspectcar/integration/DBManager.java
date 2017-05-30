package se.kth.iv1350.inspectcar.integration;

import java.util.ArrayList;
import java.util.List;
import se.kth.iv1350.inspectcar.model.Car;

/**
 * This class is responsible for database calls. This is the only place the database is called.
 */
public class DBManager {
    private List<InspectionRegistry> dummyInspectionList;

    /**
     * Creates a new instance, which uses a hard coded list of inspections instead of calling a
     * database.
     */
    public DBManager() {
        createDummyInspections();
    }

    /**
    * Getter for the dummyInspectionList
    */
    public List<InspectionRegistry> getList(){
        return this.dummyInspectionList;
    }

    /**
     * Searches the database for inspections to be performed on the specified car. This dummy
     * implementation returns hard coded inspections for some cars.
     *
     * @param car   The car to inspect.
     * @return  A list of <code>InspectionItem</code>s, where each element describes one particular control.
     */
    public List<InspectionRegistry> findInspectionsForCar(Car car) {
        String regNR = "ABC123";
        if (car.getRegNo().equals(regNR)) {
            return dummyInspectionList;
        }
        return null;
    }


    private void createDummyInspections() {
        dummyInspectionList = new ArrayList<>();
        dummyInspectionList.add(new InspectionRegistry("brakes", 10));
        dummyInspectionList.add(new InspectionRegistry("suspension", 20));
        dummyInspectionList.add(new InspectionRegistry("stearing", 30));
    }
}

