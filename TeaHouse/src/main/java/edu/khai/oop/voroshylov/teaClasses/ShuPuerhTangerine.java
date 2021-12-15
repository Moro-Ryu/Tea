package edu.khai.oop.voroshylov.teaClasses;

import edu.khai.oop.voroshylov.abstractClassesTeaHouse.Tea;

public class ShuPuerhTangerine extends Tea {

    public ShuPuerhTangerine(){

        description = "Shu pu-erh in tangerine ";
    }

    @Override
    public double cost() {

        return 30.0;
    }
}
