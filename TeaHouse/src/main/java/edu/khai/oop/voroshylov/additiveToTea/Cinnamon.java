package edu.khai.oop.voroshylov.additiveToTea;

import edu.khai.oop.voroshylov.abstractClassesTeaHouse.Additive;
import edu.khai.oop.voroshylov.abstractClassesTeaHouse.Tea;

public class Cinnamon extends Additive {

    Tea tea;

    public Cinnamon(Tea tea){

        this.tea = tea;
    }

    @Override
    public String getDescription() {

        return tea.getDescription() + ", Cinnamon ";
    }

    @Override
    public double cost() {

        return 7.0 + tea.cost();
    }
}
