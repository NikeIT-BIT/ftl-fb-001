package com.company.T020;

public abstract class SolidRevolution implements Shape{
    Double radius;

    public SolidRevolution(Double radius) {
        this.radius = radius;
    }

    public Double getRadius(){
        return this.radius;
    }
}
