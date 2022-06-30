package com.company.T012;

public class PrimeNumbers {

    private static void runPrimeNumbers(){
        for(int i = 2; i < 100; i++){
            if(i % 2 != 0 || i == 2)
                if(i % 3 != 0 || i == 3) System.out.printf("%d ", i);
        }
        System.out.println();
    }

    public static void run(){
        runPrimeNumbers();
    }

}
