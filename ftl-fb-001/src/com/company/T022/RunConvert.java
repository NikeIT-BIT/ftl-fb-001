package com.company.T022;

public class RunConvert {
    public static void run(){
        Celsius celsius = new Celsius();
        Kelvins kelvins = new Kelvins();
        Fahrenheit fahrenheit = new Fahrenheit();
        System.out.println(celsius.getConvert(0d));
        System.out.println(kelvins.getConvert(0d));
        System.out.println(fahrenheit.getConvert(0d));
    }
}
