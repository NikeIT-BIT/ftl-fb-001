package com.company.animals;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal{
    public Dog(String name, AnimalWeight weight) {
        super(name, weight, MoveType.WALK);
    }

    public static List<Dog> randomArray(){
       List<Dog> dogs = new ArrayList<>();

       try {
           dogs.add(Dog.of("Barsik", new AnimalWeight(4, AnimalWeight.WeightType.KG)));
           dogs.add(Dog.of("Tuzik", new AnimalWeight(4, AnimalWeight.WeightType.KG)));
           dogs.add(Dog.of("Lesha", new AnimalWeight(4, AnimalWeight.WeightType.KG)));
       }catch (WeightExeption e){
            e.printStackTrace();
       }
        return dogs;
    }

    public Dog() {
        super(MoveType.WALK);
    }

    public void goToStick(Integer stickPosition){
        Integer delta =  stickPosition - this.correctPosition;
        this.funForward(delta);
    }
    public void whereDog(){
        System.out.println(this.correctPosition);
    }

    public static   Dog of(String name, AnimalWeight weight){
        return new Dog(name, weight);
    }
    public static Dog ofHomeless (AnimalWeight weight){
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
