package com.company.T022;

public class Kelvins implements Convert{
    @Override
    public Double getConvert(Double meaning) {
        return meaning + 273;
    }
}
