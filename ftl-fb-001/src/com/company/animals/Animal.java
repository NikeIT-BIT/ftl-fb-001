package com.company.animals;

public abstract class Animal {

    public static class WeightExeption extends RuntimeException{

    }

    public static class AnimalWeight{
        public enum WeightType{
            KG, GR
        }
        private Integer value;
        private WeightType weightType;

        public AnimalWeight(Integer value, WeightType weightType) throws WeightExeption{
            if(value < 0 ) throw new WeightExeption();
            this.value = value;
            this.weightType = weightType;
        }

        @Override
        public String toString() {
            return "AnimalWeight{" +
                    "weightType=" + weightType +
                    '}';
        }

        public Integer getValue() {

            return value;
        }

        public void setValue(Integer value) {
            if(value < 0) throw new WeightExeption();
            this.value = value;
        }

        public WeightType getWeightType() {
            return weightType;
        }

        public void setWeightType(WeightType weightType) {
            this.weightType = weightType;
        }
    }
    protected String name;
    protected AnimalWeight weight;
    protected Integer correctPosition = 0;
    protected MoveType moveType;

    public Animal(String name, AnimalWeight weight, MoveType moveType) {
        this.name = name;
        this.weight = weight;
        this.moveType = moveType;
    }

    public Animal(MoveType moveType) {
        this.moveType = moveType;
    }

    public abstract void voice();

    protected void funForward (Integer length){
        this.correctPosition += length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnimalWeight getWeight() {
        return weight;
    }

    public void setWeight(AnimalWeight weight) {
        this.weight = weight;
    }

    public Integer getCorrectPosition() {
        return correctPosition;
    }

    public void setCorrectPosition(Integer correctPosition) {
        this.correctPosition = correctPosition;
    }

    public MoveType getMoveType() {
        return moveType;
    }

    public void setMoveType(MoveType moveType) {
        this.moveType = moveType;
    }
}
