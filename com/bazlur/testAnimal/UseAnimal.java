package com.bazlur.testAnimal;

public class UseAnimal {

    public void doSomething(Horse animal){
        System.out.println("Inside Horse version.");
    }
    public void doSomething(Animal animal){
        System.out.println("Inside Animal version.");
    }

    public static void main(String[] args) {
        Animal animal = new Horse();
        UseAnimal useAnimal = new UseAnimal();
        useAnimal.doSomething(animal);
    }
}
