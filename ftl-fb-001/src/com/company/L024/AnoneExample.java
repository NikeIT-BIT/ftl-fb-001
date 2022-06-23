package com.company.L024;

import com.company.animals.Flight;

public class AnoneExample {
    public static void run(){
        Flight flight = new Flight() {
            @Override
            public void takeoff() {

            }

            @Override
            public void landing() {

            }
        };
        flight.landing();
        flight.takeoff();
    }
}
