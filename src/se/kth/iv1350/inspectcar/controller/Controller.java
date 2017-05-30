package se.kth.iv1350.inspectcar.controller;
import se.kth.iv1350.inspectcar.integration.*;
import se.kth.iv1350.inspectcar.model.*;
import se.kth.iv1350.inspectcar.integration.DBManager;

import java.util.List;

/**
 * Created by Röglas on 2017-05-03.
 */


public class Controller {
    private DBManager dbMgr;
    private Garage garage;
    private Result result;
    private Receipt receipt;


    public Controller(DBManager dbMgr) {
        this.dbMgr = dbMgr;
        this.garage = new Garage(dbMgr);
        this.result = new Result(dbMgr);
        this.receipt = new Receipt();
    }

    /**
     * Operate opens or closes door based on input (true = open, false = closed)
     * @param status the status of the door.
     */
        public void operateDoor(boolean status) {
        if (status == true){
            garage.openDoor();
        }
        else{
            garage.closeDoor();
        }
    }

    /**
    * Calls the newCustomer method in Garage that opens garage door, iterates display and resets the max amount of instructions.
    */
    public void callNextInspection() {
        garage.newCustomer();
    }

    /**
    * Calls the sendResult method which shows the current inspection.
    */
    public void showInspection(){
        result.sendResult();
    }

    /**
     * Creates an instance of the type Receipt and calls the SendReceipt method which prints the receipt.
     * @param regnr the reg number for the car which receipt shall be showed.
     */
    public void showReceipt(String regnr){
        Car car = new Car(regnr);
        Inspection inspection = new Inspection(car, dbMgr);
        receipt.SendReceipt(inspection.getCost());
    }

    /**
     * Creates a fresh instance of Inspection using db and car and prints what's to be inspected.
     * @param regnr the reg number for the car which shall be inspected.
     */
    public void showInspectionList(String regnr){
        Car car = new Car(regnr);
        Inspection ins = new Inspection(car, dbMgr);
        ins.fullInspection();
    }

    /**
     * Passes the boolean value of true/false to the gradeInspections method.
     * @param grade the result pass or fail(true/false).
     */
    public void enterResult(boolean grade) {
        result.gradeInspections(grade);
    }

    /**
     * Passes the credit card information and amount and checks with the Authentication service (Not fully implemented).
     * @param card the credit card.
     * @param amount amaunt that shall be payed.
     * @return  the card that shall be authenticated.
     */
    public boolean authenticateCard(CreditCard card, double amount){
        CardPayment cardPay = new CardPayment(card, amount);
        return cardPay.Authentication(card, amount);
    }

    /**
     * Creates instance based on regNo and checks for the cost of the stored inspection.
     * @param regNo the regno the shall be inspected.
     * @return  the cost of the inspection
     */
    public double enterRegNo(String regNo) {
        Car car = new Car(regNo);
        Inspection inspection = new Inspection(car, dbMgr);
        return inspection.getCost();
    }

}
