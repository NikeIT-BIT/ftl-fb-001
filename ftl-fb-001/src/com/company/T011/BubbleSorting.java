package com.company.T011;

import java.util.LinkedList;
import java.util.List;

public class BubbleSorting {

    private static int generate(){
        Integer random = (int) (Math.random() * 10);
        return random;
    }

    private static List<Integer> createArray(){
        List<Integer> array = new LinkedList<>();
        for(int i = 0; i < 10; i++)
            array.add(generate());
        return array;
    }

    private static void printArray(List <Integer> array){
        System.out.println(array);
    }

    private static void runBubbleSorting(List <Integer> array){
        Integer buffer;
        for(int j = 1; j < 10; j++) {
            for (int i = 0; i < 10 - j; i++) {
                buffer = array.get(i + 1);
                if (array.get(i) > array.get(i + 1)) {
                    array.set(i + 1, array.get(i));
                    array.set(i, buffer);
                }
            }
        }
    }
    public static void run(){
        List <Integer> array = createArray();
        printArray(array);
        runBubbleSorting(array);
        printArray(array);
    }

}
