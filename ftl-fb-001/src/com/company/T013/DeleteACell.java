package com.company.T013;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DeleteACell {
    private static int generate(){
        Integer random = (int) (Math.random() * 10);
        return random;
    }

    private static List<Integer> createArray(){
        List<Integer> array = new LinkedList<>();
        for(int i = 0; i < 10; i++)
            array.add(generate());
        return array;
    }

    private static void printArray(List <Integer> array){
        System.out.println(array);
    }

    private static int number(){
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        return number;
    }

    private static void deleteCell(List <Integer> array){

        Integer counter = 10;
        Integer number = number();

        for(int i = 0; i < counter; i++){
            if(array.get(i) == number){
                array.remove(i);
                counter--;
            }
        }

//        for(int i = 0; i < 10; i++){
//            if(array.get(i) != number) array.set(counter++, array.get(i));
//        }
//        for(int i = 0; i < counter; i++) System.out.printf("%d ", array.get(i));
//        System.out.println();
    }
    public static void run(){
        List <Integer> array = createArray();
        printArray(array);
        deleteCell(array);
        printArray(array);
    }
}
