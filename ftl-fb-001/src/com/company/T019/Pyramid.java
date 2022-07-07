package com.company.T019;

public class Pyramid extends Shape{
    Double h;
    Double s;

    public Pyramid(Double h, Double s) {
        this.h = h;
        this.s = s;
    }

    @Override
    public Double getVolume() {
        return this.h * this.s * 4 / 3;
    }
}
