package com.company.animals;

public class Dog extends Animal{
    public Dog(String name, Integer weight) {
        super(name, weight);
    }

    public Dog() {
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
}
