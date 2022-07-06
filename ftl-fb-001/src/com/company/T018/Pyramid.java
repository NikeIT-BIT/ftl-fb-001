package com.company.T018;

public class Pyramid extends Shape{
    Double h;
    Double s;

    public Pyramid(Double volume, Double h, Double s) {
        super(h * s * 4 / 3);
        this.s = s;
        this.h = h;
    }
}
