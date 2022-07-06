package com.company.T015;


import java.util.LinkedList;
import java.util.List;

public class ArrayValuesAndWeights {
    List<Integer> massValue;
    List<Integer> massWeights;

    public ArrayValuesAndWeights(List<Integer> massValue, List<Integer> massWeights) {
        this.massValue = massValue;
        this.massWeights = massWeights;
    }

    public static List<Integer> mass() {
        List<Integer> mass = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            mass.add((int) (Math.random() * 10));
        }
        return mass;
    }

    private Integer maxElementMass() {
        Integer maxElementMass = this.massWeights.get(0);
        for (int i = 0; i < 10; i++) {
            if (this.massWeights.get(i) > maxElementMass) maxElementMass = this.massWeights.get(i);
        }
        return maxElementMass;
    }

    public Integer randomElementMass() {
        Integer randomElementMass = null;
        List<Integer> chanceMass = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            int chance = ((this.massWeights.get(i) % maxElementMass() * 10) + this.massWeights.get(i) / maxElementMass() * 100);
            chanceMass.add(chance);
        }
        System.out.println(chanceMass);
        int random = (int) (Math.random() * 100);
        boolean exit = false;
        for (int i = 1; i < 10 && !exit; i++) {
            if (random < chanceMass.get(i)) {
                randomElementMass = this.massValue.get(i);
                exit = true;
            }
        }
        return randomElementMass;
    }


}
