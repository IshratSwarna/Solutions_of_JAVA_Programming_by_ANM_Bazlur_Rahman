package com.bazlur.java;

public class PersonDemo {
    
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Swarna",22,"*********");

        person1.setName("Erina");
        person1.setAge(18);
        person1.setPhoneNumber("*********");

        person1.printStates();
        person2.printStates();
    }
}
