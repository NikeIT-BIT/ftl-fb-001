package com.company.T017;

public class FindRootEquation {
    private static Double decision(Double x) {
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - (345.3 * x) - 23;
    }

    private static Double rootEquation(Double leftX, Double rightX) {
        double accuracy = 0.001d;
        Double middle = (leftX + rightX) / 2;
        if (Math.abs(decision(middle)) > accuracy) {
            if ((decision(middle) > 0 && decision(rightX) < 0) || (decision(middle) < 0 && decision(rightX) > 0)) {
                return rootEquation(middle, rightX);

            }
            if ((decision(leftX) > 0 && decision(middle) < 0) || (decision(leftX) < 0 && decision(middle) > 0)) {
                return rootEquation(leftX, middle);
            }
        }
        return middle;
    }

    public static void run() {
        System.out.printf("%.4f", rootEquation(0.0d, 10.0d));
        System.out.println();
    }

}
