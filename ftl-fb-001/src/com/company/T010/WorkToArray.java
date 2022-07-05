package com.company.T010;

import java.util.LinkedList;
import java.util.List;

public class WorkToArray {
    private static double generate(){
        Integer random = (int) (Math.random() * 100);
        return (double)random/100;
    }

    private static List <Double> createArray(){
        List <Double> array = new LinkedList<>();
        for(int i = 0; i < 10; i++)
            array.add(generate());
        return array;
    }

    private static void printArray(List <Double> array){
        System.out.println(array);
    }

    private static void runPrintMin(List<Double> array){
        Double min = array.get(0);
            for(int i = 1; i < 10; i++) {
                if (min > array.get(i))
                    min = array.get(i);
            }
            System.out.println("Minimum: " + min);
    }

    private static void runPrintMax(List <Double> array){
        Double max = array.get(0);
        for(int i = 1; i < 10; i++) {
            if (max < array.get(i))
                max = array.get(i);
        }
        System.out.println("Maximum: " + max);

    }
    private static void runPrintAverage(List <Double> array){
        Double sum = 0d;
        for(int i = 1; i < 10; i++) {
                sum += array.get(i);
        }
        Double averge = sum/10;
        System.out.printf("Averge: %.2f", averge);
        System.out.println();
    }

    public static void run(){
        List <Double> array = createArray();
        printArray(array);
        runPrintMin(array);
        runPrintMax(array);
        runPrintAverage(array);
    }
}
