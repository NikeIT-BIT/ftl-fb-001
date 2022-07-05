package com.company.T014;

import java.util.LinkedList;
import java.util.List;

public class VectorInSpace {
    public final Double x, y, z;

    public VectorInSpace(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    private double getLength() {
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }

    private double scalarProduct(VectorInSpace vectorTwo) {
        return ((this.x * vectorTwo.x) + (this.y * vectorTwo.y) + (this.z * vectorTwo.z));
    }

    public VectorInSpace vectorProduct(VectorInSpace vectorTwo) {
        Double newX, newY, newZ;
        newX = (this.y * vectorTwo.z) - (this.z * vectorTwo.y);
        newY = -((this.x * vectorTwo.z) - (this.z * vectorTwo.x));
        newZ = (this.x * vectorTwo.y) - (this.y * vectorTwo.x);
        return new VectorInSpace(newX, newY, newZ);
    }

    public double cosAngel(VectorInSpace vectorTwo) {
        return (scalarProduct(vectorTwo) / (getLength() * vectorTwo.getLength()));
    }

    public VectorInSpace sumVector(VectorInSpace vectorTwo) {
        Double newX, newY, newZ;
        newX = this.x + vectorTwo.x;
        newY = this.y + vectorTwo.y;
        newZ = this.z + vectorTwo.z;
        return new VectorInSpace(newX, newY, newZ);
    }

    public VectorInSpace differenceVector(VectorInSpace vectorTwo) {
        Double newX, newY, newZ;
        newX = this.x - vectorTwo.x;
        newY = this.y - vectorTwo.y;
        newZ = this.z - vectorTwo.z;
        return new VectorInSpace(newX, newY, newZ);
    }

    public static void printVector(VectorInSpace vector){
        System.out.printf("%.2f %.2f %.2f", vector.x, vector.y, vector.z);
        System.out.println();
    }

    public static List <VectorInSpace> massVectors(Integer N){
        List <VectorInSpace> massVectors = new LinkedList<>();
        for (int i = 0; i < N; i++){
            Double x = Math.random() * 100;
            Double y = Math.random() * 100;
            Double z = Math.random() * 100;
            VectorInSpace vector = new VectorInSpace(x, y, z);
            massVectors.add(i, vector);
        }
        for (int i = 0; i < N; i++){
            VectorInSpace vector = massVectors.get(i);
            System.out.printf("%.2f %.2f %.2f", vector.x, vector.y, vector.z);
            System.out.println();
        }
        return massVectors;
    }

}
