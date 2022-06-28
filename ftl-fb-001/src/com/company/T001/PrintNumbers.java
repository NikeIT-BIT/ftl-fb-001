package com.company.T001;

public class PrintNumbers {

    private static void runPrintNumbers(){
        for(int i = 1; i <= 5; i++) {
            System.out.print(" ");
            System.out.print(i);
        }
        System.out.println();
    }

    public static void run(){
        runPrintNumbers();
    }
}
