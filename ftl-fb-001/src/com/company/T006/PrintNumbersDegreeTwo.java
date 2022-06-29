package com.company.T006;

public class PrintNumbersDegreeTwo {
    private static void runPrintNumbers(){
        Integer Degree = 1;

        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d ", Degree);
            Degree = Degree * 2;
        }
        System.out.println();
    }

    public static void run(){
        runPrintNumbers();
    }
}
