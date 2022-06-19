package com.company.animals;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal{
    public Dog(String name, Integer weight) {
        super(name, weight);
    }

    public static List<Dog> randomArray(){
       List<Dog> dogs = new ArrayList<>();
       dogs.add(Dog.of("Barsik", 4));
       dogs.add(Dog.of("Tuzik", 3));
       dogs.add(Dog.of("Lesha", 5));
       return dogs;
    }

    public Dog() {
        this.canFly = false;
    }

    public void goToStick(Integer stickPosition){
        Integer delta =  stickPosition - this.correctPosition;
        this.funForward(delta);
    }
    public void whereDog(){
        System.out.println(this.correctPosition);
    }

    public static   Dog of(String name, Integer weight){
        return new Dog(name, weight);
    }
    public static Dog ofHomeless (Integer weight){
        Dog dog = new Dog();
        dog.weight = weight;
        return dog;
    }
    @Override
    public void voice() {
        System.out.println("Wow!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", correctPosition=" + correctPosition +
                '}';
    }
}
