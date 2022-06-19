package com.company;

import com.company.L001.HelloWorld;
import com.company.L002.POJO;
import com.company.L013.SwitchExample;
import com.company.animals.Cat;
import com.company.animals.Dog;
import com.company.animals.Duck;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

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


        List<Dog> dogs = Dog.randomArray();
        for(int i = 0; i < dogs.size(); i++)
          System.out.println(dogs.get(i));


        List<Dog> dogsHomless = Arrays.asList(new Dog[]{
             Dog.ofHomeless(2),
             Dog.ofHomeless(3),
             Dog.ofHomeless(4)
        });
        System.out.println(dogsHomless.size());
        for(Dog dogItem : dogsHomless) {
            System.out.println(dogItem);
            dogItem.setName(String.valueOf((new Random()).nextLong()));
            System.out.println(dogItem.getName());
        }

        List<Dog> dogsLinkedList = new LinkedList<>();
        dogsLinkedList.add(Dog.ofHomeless(10));
        dogsLinkedList.add(Dog.ofHomeless(10));
        dogsLinkedList.add(Dog.ofHomeless(10));
        dogsLinkedList.add(Dog.ofHomeless(10));
        dogsLinkedList.add(Dog.ofHomeless(10));

        int indexLinkedList = 0;
        while (indexLinkedList < dogsLinkedList.size()){
            System.out.println(dogsLinkedList.get(indexLinkedList));
            indexLinkedList++;
        }
//        for(int i = 0; i < 10; i++)
//            SwitchExample.run();
    }

}