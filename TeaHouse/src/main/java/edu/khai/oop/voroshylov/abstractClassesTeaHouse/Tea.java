package edu.khai.oop.voroshylov.abstractClassesTeaHouse;

import edu.khai.oop.voroshylov.teaClasses.Masala;

public abstract class Tea {


    protected String description = "Unknown tea";

    public String getDescription(){

        return description;
    }

    public abstract double cost();
}
