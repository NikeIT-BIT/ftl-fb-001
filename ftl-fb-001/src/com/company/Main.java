package com.company;

import com.company.L001.HelloWorld;
import com.company.L002.POJO;
import com.company.L013.SwitchExample;
import com.company.L019.StringExample;
import com.company.L020.TypeConversion;
import com.company.L026.FileExample;
import com.company.L027.ThreadExample;
import com.company.L028.House;
import com.company.T001.PrintNumbers;
import com.company.T002.PrintNumbersMirror;
import com.company.T003.PrintNumbersMultiplierThree;
import com.company.T004.PrintNumberDoUsers;
import com.company.T005.PrintNumbersMultiplierSeven;
import com.company.T006.PrintNumbersDegreeTwo;
import com.company.T007.Asterisks;
import com.company.animals.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    
    public static void main(String[] args) throws IOException {
//        HelloWorld.run();
//        POJO.run();
//
//        Cat catVar = new Cat();
//        catVar.voice();
//
//        com.company.L004.Cat catL004 = new com.company.L004.Cat();
//        catL004.voice();
//        Cat cat = new Cat("Murzik", new Animal.AnimalWeight(20, Animal.AnimalWeight.WeightType.KG));
//        System.out.println(cat.jumpHeight());
//        cat.voice();
//
//        Dog dog = new Dog();
//        dog.goToStick(14);
//        dog.whereDog();
//
//        dog.voice();
//        Dog homelessdog = Dog.ofHomeless(new Animal.AnimalWeight(100, Animal.AnimalWeight.WeightType.KG));
//        homelessdog.voice();
//
//        Duck duck = new Duck();
//        duck.voice();
////        duck.takeOff();
//        duck.isTheBirdFlying();
//        duck.showSpeed();
//        duck.landing();
//        duck.isTheBirdFlying();
//        duck.showSpeed();
//
//
//        List<Dog> dogs = Dog.randomArray();
//        for(int i = 0; i < dogs.size(); i++)
//          System.out.println(dogs.get(i));
//
//
//
//        List<Dog> dogsHomless = Arrays.asList(new Dog[]{
//             Dog.ofHomeless(new Animal.AnimalWeight(2, Animal.AnimalWeight.WeightType.KG)),
//             Dog.ofHomeless(new Animal.AnimalWeight(3, Animal.AnimalWeight.WeightType.KG)),
//             Dog.ofHomeless(new Animal.AnimalWeight(4, Animal.AnimalWeight.WeightType.KG))
//        });
//        System.out.println(dogsHomless.size());
//        for(Dog dogItem : dogsHomless) {
//            System.out.println(dogItem);
//            dogItem.setName(String.valueOf((new Random()).nextLong()));
//            System.out.println(dogItem.getName());
//        }
//
//        List<Dog> dogsLinkedList = new LinkedList<>();
//        dogsLinkedList.add(Dog.ofHomeless(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG)));
//        dogsLinkedList.add(Dog.ofHomeless(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG)));
//        dogsLinkedList.add(Dog.ofHomeless(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG)));
//        dogsLinkedList.add(Dog.ofHomeless(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG)));
//        dogsLinkedList.add(Dog.ofHomeless(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG)));
//
//        int indexLinkedList = 0;
//        while (indexLinkedList < dogsLinkedList.size()){
//            System.out.println(dogsLinkedList.get(indexLinkedList));
//            indexLinkedList++;
//        }
////        for(int i = 0; i < 10; i++)
////            SwitchExample.run();
//        System.out.println(duck.getMoveType());
//        System.out.println(dog.getMoveType().getValue());
//
//        if(dog.getMoveType() == MoveType.WALK)
//            System.out.println("Может ходить");
//        StringExample.run();
//        TypeConversion.run();
//
//        dog.setWeight(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG));
//        try {
//            dog.getWeight().setValue(-5);
//        }catch (Animal.WeightExeption ignore) {
//
//        }
//
//
//        FileExample.run();
//        ThreadExample.run();
//
//        House house = new House.Builder()
//                .optHasFancyStatues(true)
//                .builder();
//        House fullHouse = new House.Builder()
//                .optHasGarage(true)
//                .optHasGarden(true)
//                .optHasSwimmingPool(true)
//                .optHasFancyStatues(true)
//                .optHasSwimmingPool(true)
//                .builder();
//        System.out.println(fullHouse.toString());

        // Independent work
//        PrintNumbers.run();
//        PrintNumbersMirror.run();
//        PrintNumbersMultiplierThree.run();
//        PrintNumberDoUsers.run();
//        PrintNumbersMultiplierSeven.run();
//        PrintNumbersDegreeTwo.run();
        Asterisks.run();


    }
}