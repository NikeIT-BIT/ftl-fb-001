package com.company.animals;

public class Dog extends Animal{
    public Dog(String name, Integer weight) {
        super(name, weight);
    }

    public static Dog[] randomArray(){
        Dog[] dogs = new Dog[3];
                dogs[0] = Dog.of("Sharik", 4);
                dogs[1] = Dog.of("Tuzik", 3);
                dogs[2] = Dog.of("Lesha", 5);
                return dogs;
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
