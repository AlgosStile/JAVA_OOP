package OopHomeWork_6.Controller;

import OopHomeWork_6.Config.LoggerConfig;
import OopHomeWork_6.Model.RationalExample;
import OopHomeWork_6.Service.Solve;
import OopHomeWork_6.Service.impl.SolveIpml;
import OopHomeWork_6.View.MenuGet;
import OopHomeWork_6.View.MenuShow;
import OopHomeWork_6.View.impl.MenuGetImpl;
import OopHomeWork_6.View.impl.MenuShowImpl;

import java.io.IOException;

/**
 * Class linking model and view
 */
public class Calculate {
    public Solve solve = new SolveIpml();

    public void start() {
        MenuGet menuGet = new MenuGetImpl();
        MenuShow menuShow = new MenuShowImpl();
        try {
            LoggerConfig.config();
        } catch (IOException e) {
            menuShow.showMessage("Error", "Problem with logging");
        }

        String action;
        do {
            action = menuShow.showMenu(menuGet);
            if (action.equals("0")) {
                return;
            }
            RationalExample example = new RationalExample(solve.checkOperation(action));
            Number[] values = menuGet.getValuesForExpression();
            example.setVariableA(values[0]);
            example.setVariableB(values[1]);
            try {
                menuShow.showMessage("Result", solve.solve(example));
            } catch (NullPointerException e) {
                menuShow.showMessage("Error", "Incorrect data. Please, input values again");
            }
        } while (true);
    }
}