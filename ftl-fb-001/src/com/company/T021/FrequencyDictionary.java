package com.company.T021;

import java.util.*;

public class FrequencyDictionary {

    String text;

    public FrequencyDictionary(String text) {
        this.text = text;
    }

    private Map<Character, Integer> dictionary(){
        Map<Character, Integer> arrayFrequencyDictionary = new HashMap<>();
        List<Character> arrayCharacter = new LinkedList<>();
        for(int i = 0; i < this.text.length(); i++){
            arrayCharacter.add(text.charAt(i));
        }
        Collections.sort(arrayCharacter);
        Character symbol = arrayCharacter.get(0);
        Integer counter = 0;
        for(int i = 0; i < this.text.length(); i++){
            if (arrayCharacter.get(i) == symbol){
                counter++;
            }else{
                arrayFrequencyDictionary.put(arrayCharacter.get(i-1), counter);
                symbol = arrayCharacter.get(i);
                counter = 1;
            }
        }

        return  arrayFrequencyDictionary;
    }

    public static void run(){
        FrequencyDictionary frequencyDictionary = new FrequencyDictionary("PRPRTTYER");
        System.out.println(frequencyDictionary.dictionary());
    }
}
