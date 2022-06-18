package com.company;

import com.company.L001.HelloWorld;
import com.company.L002.POJO;
import com.company.animals.Cat;
import com.company.animals.Dog;
import com.company.animals.Duck;

public class Main {
    public static void main(String[] args) {
//        HelloWorld.run();
//        POJO.run();
//
//        Cat catVar = new Cat();
//        catVar.voice();
//
//        com.company.L004.Cat catL004 = new com.company.L004.Cat();
//        catL004.voice();
        Cat cat = new Cat("Murzik", 20);
        System.out.println(cat.jumpHeight());
        cat.voice();

        Dog dog = new Dog();
        dog.goToStick(14);
        dog.whereDog();

        dog.voice();
        Dog homelessdog = Dog.ofHomeless(100);
        homelessdog.voice();

        Duck duck = new Duck();
        duck.voice();
        duck.takeOff();
        duck.isTheBirdFlying();
        duck.showSpeed();
        duck.landing();
        duck.isTheBirdFlying();
        duck.showSpeed();

        Dog[] dogsHomless = new Dog[]{
             Dog.ofHomeless(2),
             Dog.ofHomeless(3),
             Dog.ofHomeless(4)
        };
        System.out.println(dogsHomless.length);
        System.out.println(dogsHomless [0]);
        System.out.println(dogsHomless [1]);
        System.out.println(dogsHomless [2]);

        Dog[] dogs = Dog.randomArray();

        System.out.println(dogs [0]);
        System.out.println(dogs [1]);
        System.out.println(dogs [2]);
    }
}