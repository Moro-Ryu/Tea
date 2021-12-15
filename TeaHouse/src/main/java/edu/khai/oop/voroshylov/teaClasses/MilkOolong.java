package edu.khai.oop.voroshylov.teaClasses;

import edu.khai.oop.voroshylov.abstractClassesTeaHouse.Tea;

public class MilkOolong extends Tea {

    public MilkOolong(){

        description = "Milk oolong ";
    }

    @Override
    public double cost() {

        return 25.0;
    }
}
