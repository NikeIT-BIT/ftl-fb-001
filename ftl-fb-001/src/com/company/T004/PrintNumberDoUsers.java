package com.company.T004;

import java.util.Scanner;

public class PrintNumberDoUsers {

    private static void runPrintNumbers(){

        // Компактная запись вода значения с клавиатуры
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        Integer result = 1;

        for(int i = 2; i <= number; i++)
            result += (i);

        System.out.println(result);

    }

    public static void run(){
        runPrintNumbers();
    }


}
