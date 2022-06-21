package com.company.animals;

public class Duck extends Bird{
    public Duck() {
        super();
    }
    public static final String DUCK_VOICE = "Quack!";
    public static final Integer SPEED_FLY = 40;
    public static final Integer SPEED_WALK = 4;
    @Override
    public void voice() {
        System.out.println(DUCK_VOICE);
    }

    public void showSpeed(){
        if(this.flyModActive == true)
            System.out.println(SPEED_FLY);
        else
            System.out.println(SPEED_WALK);
    }
}
