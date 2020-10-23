package com.bmi;

public class BMI {
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    private String name;
    private double weight; // in pounds
    private double height; // in inches

    //constructor
    public BMI(String name, double weight, double height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public double getBMI(){
        return ((weight*KILOGRAMS_PER_POUND)/(height*METERS_PER_INCH*height*METERS_PER_INCH));
    }

    public String getStatus(){
        double bmi = getBMI();

        if(bmi < 18.5){
            return "Underweight";
        }
        else if(bmi < 25.0){
            return "Normal or Healthy weight";
        }
        else if(bmi < 30.0){
            return "Overweight";
        }
        return "obese";
    }

    public String getName(){
        return name;
    }
}