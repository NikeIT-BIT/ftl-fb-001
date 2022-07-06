package com.company.T016;

import java.util.*;

public class SearchingArrayElement {
    Integer arraySize;
    List<Integer> array = new LinkedList<>();
    Integer element;

    public SearchingArrayElement(Integer arraySize, Integer element) {
        this.arraySize = arraySize;
        this.element = element;
    }

    private void createArray() {
        for (int i = 0; i < arraySize; i++)
            this.array.add((int) (Math.random() * 100));
    }

    private void sortMassive() {
        Collections.sort(this.array);
    }

    private String isIncludeEnumeration() {
        String isInclude = "Is not include!";
        for (int i = 0; i < arraySize; i++) {
            if (Objects.equals(this.array.get(i), element)) {
                isInclude = "Is include!";
                break;
            }
        }
        return isInclude;
    }

    private String isIncludeBinary() {
        String isInclude = "Is not include!";
        int left = -1;
        int right = arraySize;
        int middle;
        while (left < right - 1) {
            middle = (left + right) / 2;
            if (this.array.get(middle) > this.element) {
                right = middle;
            } else if (this.array.get(middle) < this.element) {
                left = middle;
            } else {
                isInclude = "Is include!";
                break;
            }
        }
        return isInclude;
    }
    
    public static void run() {
        SearchingArrayElement searchingArrayElement = new SearchingArrayElement(10, 5);
        searchingArrayElement.createArray();
        System.out.println(searchingArrayElement.array);
        System.out.println(searchingArrayElement.isIncludeEnumeration());
        searchingArrayElement.sortMassive();
        System.out.println(searchingArrayElement.isIncludeBinary());
    }
}
