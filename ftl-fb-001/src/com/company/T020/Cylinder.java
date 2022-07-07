package com.company.T020;

public class Cylinder extends SolidRevolution{
    Double height;

    public Cylinder(Double radius, Double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public Double getVolume() {
        return Math.PI * Math.pow(radius, 2) * this.height;
    }
}
