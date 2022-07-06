package com.company.T015;

import java.util.LinkedList;
import java.util.List;

public class RunArrayValuesAndWeights {
    public static void run() {
        ArrayValuesAndWeights arrayValuesAndWeights = new ArrayValuesAndWeights(ArrayValuesAndWeights.mass(), ArrayValuesAndWeights.mass());
        System.out.println(arrayValuesAndWeights.massValue);
        System.out.println(arrayValuesAndWeights.massWeights);
        Integer randomElementMass = arrayValuesAndWeights.randomElementMass();
        System.out.println(randomElementMass);

    }

}
