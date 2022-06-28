package com.company.T002;

public class PrintNumbersMirror {


    private static void runPrintNumbers(){
        for(int i = 5; i >= 1; i--) {
            System.out.print(" ");
            System.out.print(i);
        }
        System.out.println();
    }

    public static void run(){
        runPrintNumbers();
    }

}
