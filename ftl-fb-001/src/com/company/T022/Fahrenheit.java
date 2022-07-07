package com.company.T022;

public class Fahrenheit implements Convert{
    @Override
    public Double getConvert(Double meaning) {
        return meaning * (9 / 5) + 32;
    }
}
