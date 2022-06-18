package com.company.animals;

public class Duck extends Bird{
    public Duck() {
    }
    @Override
    public void voice() {
        System.out.println("Quack!");
    }

    public void showSpeed(){
        if(this.flyModActive == true)
            System.out.println("40");
        else
            System.out.println("4");
    }
}
