package com.company.animals;

public class Animal {
    protected String name;
    protected Integer weight;
    protected Integer correctPosition = 0;

    public Animal(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public Animal() {
    }

    public void voice(){
        System.out.println("voice!!!");
    }

    protected void funForward (Integer length){
        this.correctPosition += length;
    }
}
