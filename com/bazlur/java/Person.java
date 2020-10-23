package com.bazlur.java;

public class Person {
    private String name;
    private int age;
    private String phoneNumber;
    
    //constructor
    public Person(){
    }

    //constructor overloading
    public Person(String name, int age, String phoneNumber){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    //getter-setter methods
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void printStates(){
        System.out.println("Name : "+name+" Age : "+age+" Phone Number : "+phoneNumber);
    }
}
