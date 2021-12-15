package edu.khai.oop.voroshylov.teaClasses;

import edu.khai.oop.voroshylov.abstractClassesTeaHouse.Tea;

public class Masala extends Tea {

    public Masala(){

        description = "Masala ";
    }

    @Override
    public double cost() {

        return 25.0;
    }
}
