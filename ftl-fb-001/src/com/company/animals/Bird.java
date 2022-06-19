package com.company.animals;

public class Bird extends Animal{

    protected boolean flyModActive = false;
    public Bird(){
        super();
        this.canFly = true;
    }

    public void takeOff(){
        flyModActive = true;
    }
    public void landing(){
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
