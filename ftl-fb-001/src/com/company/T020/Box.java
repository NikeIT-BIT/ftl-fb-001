package com.company.T020;

import java.util.LinkedList;
import java.util.List;

public class Box implements Shape{
    List<Shape> shapesT020 = new LinkedList<>();
    Double thereIsPlace;
    Double volume;

    public Box(Double thereIsPlace) {
        this.thereIsPlace = thereIsPlace;
    }
    public Boolean add(Shape shape){
        if (thereIsPlace >= shape.getVolume()){
            shapesT020.add(shape);
            thereIsPlace =- shape.getVolume();
            return true;
        }else return false;
    }

    @Override
    public Double getVolume() {
        return volume;
    }
}
