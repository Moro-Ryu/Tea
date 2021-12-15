package edu.khai.oop.voroshylov.additiveToTea;

import edu.khai.oop.voroshylov.abstractClassesTeaHouse.Additive;
import edu.khai.oop.voroshylov.abstractClassesTeaHouse.Tea;

public class Lemon extends Additive {

    Tea tea;

    public Lemon (Tea tea){

        this.tea = tea;
    }

    @Override
    public String getDescription () {

        return tea.getDescription () + ", Lemon ";
    }

    @Override
    public double cost() {
        return 5.0 + tea.cost();
    }
}
