package edu.khai.oop.voroshylov.additiveToTea;

import edu.khai.oop.voroshylov.abstractClassesTeaHouse.Additive;
import edu.khai.oop.voroshylov.abstractClassesTeaHouse.Tea;

public class Anise extends Additive {

    Tea tea;

    public Anise(Tea tea){

        this.tea = tea;
    }

    @Override
    public String getDescription() {

        return tea.getDescription() + ", Anise ";
    }

    @Override
    public double cost() {

        return 5.0 + tea.cost();
    }
}
