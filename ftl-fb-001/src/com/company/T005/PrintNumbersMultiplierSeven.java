package com.company.T005;

public class PrintNumbersMultiplierSeven {

    private static void runPrintNumbers(){

        Integer number = 0;

        for(int i = 1; number < 98; i++) {
            number = 7 * i;
            System.out.printf("%d ", number);
        }
    }

    public static void run(){
        runPrintNumbers();
    }

}
