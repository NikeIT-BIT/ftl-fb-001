package com.company.T003;

public class PrintNumbersMultiplierThree {

    private static void runPrintNumbers(){
        for(int i = 1; i <= 10; i++) {
            System.out.printf("3*%d=%d \n", i, i*3);
        }
    }

    public static void run(){
        runPrintNumbers();
    }

}
