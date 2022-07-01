package com.company.T012;

public class PrimeNumbers {

    private static void runPrimeNumbers(){
        for(int i = 2; i <= 100; i++){
            Boolean primeNumber = false;
            Integer divider = 1;
            for(int j = 2; j <= i; j++){
                if(i % j == 0) divider++;
            }
            if (divider == 2) primeNumber = true;
            if (primeNumber) System.out.printf("%d ", i);
        }
    }

    public static void run(){
        runPrimeNumbers();
    }

}
