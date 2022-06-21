package com.company.animals;

public class Bird extends Animal{

    protected boolean flyModActive = false;
    public Bird(){
        super(MoveType.FLY);
    }

    public final void takeOff(){
        flyModActive = true;
    }
    public final void landing(){
        flyModActive = false;
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
