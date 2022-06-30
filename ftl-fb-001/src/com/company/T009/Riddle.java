package com.company.T009;

import java.util.Scanner;

public class Riddle {
    private static void runRiddle(){

        System.out.println("What is it: blue, big, with a mustache and completely stuffed with hares?");

        for(int i = 1; i <= 3; i++){
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            final String correct = "Trolleybus";
            final String giveUp = "Give up";


            switch (input){
                case (correct):
                    System.out.println("It's okey!");
                    i = 3;
                    break;
                case (giveUp):
                    System.out.println("Correct: Trolleybus!");
                    i = 3;
                    break;
                default:
                    System.out.println("Try again!");
                    break;
            }
        }

    }
    public static void run(){
        runRiddle();
    }
}

