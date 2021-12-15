package edu.khai.oop.voroshylov.teaClasses;

import edu.khai.oop.voroshylov.abstractClassesTeaHouse.Tea;

public class Matcha extends Tea {

    public Matcha(){

        description = "Matcha ";
    }

    @Override
    public double cost() {

        return 30.0;
    }
}
