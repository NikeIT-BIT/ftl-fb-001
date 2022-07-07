package com.company.T019;

public class RunHierarchy {
    public static void run(){
        Ball ball = new Ball(5d);
        Cylinder cylinder = new Cylinder(5d, 5d);
        Pyramid pyramid = new Pyramid(50d, 50d);

        Box box = new Box(2000d);
        box.add(ball);
        box.add(cylinder);
        box.add(pyramid);
    }
}
