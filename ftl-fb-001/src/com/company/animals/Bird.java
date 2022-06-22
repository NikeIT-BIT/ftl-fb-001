package com.company.animals;

public abstract class Bird extends Animal implements Flight{

    protected boolean flyModActive = false;
    public Bird(){
        super(MoveType.FLY);
    }

    @Override
    public void takeoff() {
        this.flyModActive = true;
    }

    @Override
    public void landing() {
        this.flyModActive = false;
    }

    public void isTheBirdFlying(){
        System.out.println(
                this.flyModActive == true ? "Flying":"Landing"
        );
    }

    public boolean isFlyModActive() {
        return flyModActive;
    }

    public void setFlyModActive(boolean flyModActive) {
        this.flyModActive = flyModActive;
    }
}
