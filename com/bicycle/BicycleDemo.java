package com.bicycle;

public class BicycleDemo{
    public static void main(String[] args){
        //creating objects for Bicycle class
        Bicycle b1 = new Bicycle();

        //calling methods on this object
        b1.printStates();
        b1.changeCadance(10);
        b1.changeGear(5);
        b1.speedUp(10);
        b1.printStates();
        b1.applyBrakes(5);
        b1.printStates();
    }
}