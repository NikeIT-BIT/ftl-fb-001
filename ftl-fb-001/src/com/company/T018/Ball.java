package com.company.T018;

public class Ball extends SolidRevolution{
    public Ball(Double volume, Double radius) {
        super(Math.PI * Math.pow(radius, 3) * 4 / 3, radius);
    }
}
