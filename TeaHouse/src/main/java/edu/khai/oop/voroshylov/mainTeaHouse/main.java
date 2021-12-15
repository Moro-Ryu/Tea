package edu.khai.oop.voroshylov.mainTeaHouse;

import edu.khai.oop.voroshylov.abstractClassesTeaHouse.Tea;
import edu.khai.oop.voroshylov.additiveToTea.Anise;
import edu.khai.oop.voroshylov.additiveToTea.Honey;
import edu.khai.oop.voroshylov.additiveToTea.Lemon;
import edu.khai.oop.voroshylov.teaClasses.Masala;
import edu.khai.oop.voroshylov.teaClasses.Matcha;
import edu.khai.oop.voroshylov.teaClasses.ShuPuerhTangerine;
import edu.khai.oop.voroshylov.teaHouseGui.GuiApplication;
import org.apache.log4j.Logger;

public class main {

    private static final Logger logger = Logger.getLogger(
            main.class);

    public static void main(String[] args) {

        Tea tea = new Matcha();
        logger.info(tea.getDescription() + tea.cost() + " UAH.");

        Tea tea2 = new ShuPuerhTangerine();
        tea2 = new Honey(tea2);
        tea2 = new Lemon(tea2);
        logger.info(tea2.getDescription() + tea2.cost() + " UAH.");

        Tea tea3 = new Masala();
        tea3 = new Honey(tea3);
        tea3 = new Lemon(tea3);
        tea3 = new Anise(tea3);
        tea3 = new Anise(tea3);

        logger.info(tea3.getDescription() + tea3.cost() + " UAH.");

        GuiApplication app = new GuiApplication();
        app.setVisible(true);
    }
}
