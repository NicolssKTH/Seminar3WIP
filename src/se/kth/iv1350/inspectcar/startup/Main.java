package se.kth.iv1350.inspectcar.startup;

/**
 * Created by Röglas on 2017-05-03.
 */
import se.kth.iv1350.inspectcar.integration.DBManager;
import se.kth.iv1350.inspectcar.integration.Printer;
import se.kth.iv1350.inspectcar.view.View;
import se.kth.iv1350.inspectcar.controller.Controller;

public class Main {

    /**
    * Creates necessary instances.
    */
    public static void main(String[] args) {
        DBManager dbMgr = new DBManager();
        Controller contr = new Controller(dbMgr);
        View view = new View(contr);
        view.Execution();
    }

}
