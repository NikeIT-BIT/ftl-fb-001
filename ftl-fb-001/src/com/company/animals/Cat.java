package com.company.animals;

public class Cat extends Animal{

    public Cat(String name, AnimalWeight weight) {
        super(name, weight, MoveType.WALK);
    }

    public Cat() {
        super(MoveType.WALK);
    }

    private Integer heightCf(AnimalWeight weight){
        if(weight.getValue() > 10)
            return 120;

        return 90;
    }

    public Integer jumpHeight(){
        if(this.weight == null)
            return 300;

        return this.heightCf(this.weight);
    }

    @Override
    public void voice() {
        System.out.println("Mey");
    }
}
