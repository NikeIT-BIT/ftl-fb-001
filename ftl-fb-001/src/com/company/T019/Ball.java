package com.company.T019;

public class Ball extends SolidRevolution{

    public Ball(Double radius) {
        super(radius);
    }

    @Override
    public Double getVolume() {
        return Math.PI * Math.pow(radius, 3) * 4 / 3;
    }



}
