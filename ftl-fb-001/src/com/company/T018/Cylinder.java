package com.company.T018;

public class Cylinder extends SolidRevolution{
    Double height;

    public Cylinder(Double volume, Double radius, Double height) {
        super(Math.PI * Math.pow(radius, 2) * height, radius);
        this.height = height;
    }
}
