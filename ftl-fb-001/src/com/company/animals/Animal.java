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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getCorrectPosition() {
        return correctPosition;
    }

    public void setCorrectPosition(Integer correctPosition) {
        this.correctPosition = correctPosition;
    }

    public Boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(Boolean canFly) {
        this.canFly = canFly;
    }
}
