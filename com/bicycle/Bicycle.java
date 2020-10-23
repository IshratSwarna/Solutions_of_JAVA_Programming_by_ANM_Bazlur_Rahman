package com.bicycle;

public class Bicycle{
    int speed = 2;
    int gear = 1;
    int cadance = 0;

    void speedUp(int increment){
        speed = speed + increment;
    }

    void changeGear(int newValue){
        gear = newValue;
    }

    void changeCadance(int newValue){
        cadance = newValue;
    }

    void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    void printStates(){
        System.out.println("Speed : "+speed+" Cadance : "+cadance+" Gear : "+gear);
    }
}