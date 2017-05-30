package se.kth.iv1350.inspectcar.integration;

/**
 * Created by Röglas on 2017-05-03.
 */

/**
 * Inspection item
 */
public class InspectionRegistry {
    private String name;
    private int cost;

    public InspectionRegistry(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
    /**
    * Getters
    */
    public int getCost(){
        return cost;
    }
    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (!(other instanceof InspectionRegistry)) {
            return false;
        }
        InspectionRegistry otherInspItem = (InspectionRegistry) other;
        return otherInspItem.cost == this.cost && otherInspItem.name == this.name;
    }
}





	/*
	public String InspectionList(Inspection inspection) {
		return null;
	}

	public Inspections findInspection(String regNo) {
		return null;
	}

	public Result InspectionResult(Inspection inspection) {
		return null;
	}
	*/


