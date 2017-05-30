package se.kth.iv1350.inspectcar.view;

/**
 * Created by Röglas on 2017-05-03.
 */
import se.kth.iv1350.inspectcar.controller.Controller;
import se.kth.iv1350.inspectcar.integration.CreditCard;
import se.kth.iv1350.inspectcar.integration.DBManager;
import se.kth.iv1350.inspectcar.model.Inspection;

public class View {
    private Controller contr;

    public View(Controller contr) {
        this.contr = contr;
    }

    public void Execution() {
        String regNoOfVehicleToInspect = "ABC123";
        double amount = 2500;
        CreditCard card = new CreditCard(2156, "6324524651488574", "Karl Karlsson", "2018-10", 542);

        contr.callNextInspection();
        contr.operateDoor(false);
        double cost = contr.enterRegNo(regNoOfVehicleToInspect);
        contr.authenticateCard(card, amount);
        contr.showReceipt(regNoOfVehicleToInspect);
        contr.showInspectionList(regNoOfVehicleToInspect);

        contr.showInspection();
        contr.enterResult(true);
        contr.showInspection();
        contr.enterResult(false);
        contr.showInspection();
        contr.enterResult(true);
        contr.showInspection();

        System.out.println("The cost is: " + cost);
    }

}