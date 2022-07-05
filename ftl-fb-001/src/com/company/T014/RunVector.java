package com.company.T014;

public class RunVector {
    public static void run() {
        VectorInSpace vectorOne = new VectorInSpace(-1d, 2d, -2d);
        VectorInSpace vectorTwo = new VectorInSpace(2d, 1d, -1d);
        VectorInSpace vectorProduct = vectorOne.vectorProduct(vectorTwo);
        Double cosAngel = vectorOne.cosAngel(vectorTwo);
        VectorInSpace sumVector = vectorOne.sumVector(vectorTwo);
        VectorInSpace differenceVector = vectorOne.differenceVector(vectorTwo);
        System.out.println("Vector product : ");
        VectorInSpace.printVector(vectorProduct);
        System.out.println("Cos angel : " + cosAngel);
        System.out.println("Summa vectors : ");
        VectorInSpace.printVector(sumVector);
        System.out.println("Difference vectors : ");
        VectorInSpace.printVector(differenceVector);
        System.out.println("Massive vectors");
        VectorInSpace.massVectors(3);
    }
}
