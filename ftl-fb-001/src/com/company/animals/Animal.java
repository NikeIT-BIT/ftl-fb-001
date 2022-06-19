package com.company.animals;

class Animal {
    protected String name;
    protected Integer weight;
    protected Integer correctPosition = 0;
    protected Boolean canFly = false;

    public Animal(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public Animal() {
        this.canFly = true;
    }

    public void voice(){
        System.out.println("voice!!!");
    }

    protected void funForward (Integer length){
        this.correctPosition += length;
    }
}
