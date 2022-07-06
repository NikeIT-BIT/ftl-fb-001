package com.company.T018;

public class SolidRevolution extends Shape{
    Double radius;

    public SolidRevolution(Double volume, Double radius) {
        super(volume);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }
}
