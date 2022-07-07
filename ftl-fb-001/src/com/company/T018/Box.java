package com.company.T018;

import java.util.LinkedList;
import java.util.List;

public class Box extends Shape{
    List <Shape> shapesT018 = new LinkedList<Shape>();
    Double thereIsPlace;

    public Box(Double volume, Double thereIsPlace) {
        super(thereIsPlace);
        this.thereIsPlace = thereIsPlace;
    }

    public Boolean add(Shape shape){
        if (thereIsPlace >= shape.getVolume()){
            shapesT018.add(shape);
            thereIsPlace =- shape.getVolume();
            return true;
        }else return false;
    }
}
