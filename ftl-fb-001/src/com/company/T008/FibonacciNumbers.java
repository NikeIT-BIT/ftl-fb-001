package com.company.T008;

import java.util.Scanner;

public class FibonacciNumbers {

    private static void runFibonacciNumbers(){

        Integer[] massFibonachi = new Integer[12];
        massFibonachi[0] = 0;
        massFibonachi[1] = 1;
        for(int i = 1; i < 11; i++){
            massFibonachi[i+1] = massFibonachi[i] + massFibonachi[i-1];
        }

        for(int i = 1; i <= 11; i++){
            System.out.printf("%d ", massFibonachi[i]);
        }
        System.out.println();


    }

    public static void run(){ runFibonacciNumbers(); }
}
