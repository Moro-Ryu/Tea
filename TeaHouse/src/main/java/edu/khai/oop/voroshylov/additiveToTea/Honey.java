package edu.khai.oop.voroshylov.additiveToTea;

import edu.khai.oop.voroshylov.abstractClassesTeaHouse.Additive;
import edu.khai.oop.voroshylov.abstractClassesTeaHouse.Tea;

public class Honey extends Additive {

    Tea tea;

    public Honey(Tea tea){

        this.tea = tea;
    }

    @Override
    public String getDescription () {

        return tea.getDescription() + ", Honey ";
    }

    @Override
    public double cost() {

        return 10.0 + tea.cost();
    }
}
