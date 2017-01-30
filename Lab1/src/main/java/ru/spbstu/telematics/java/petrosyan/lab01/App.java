package ru.spbstu.telematics.java.petrosyan.lab01;

import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.exception.*;
/**
 * Hello world!
 */


public class App {

    public double realVectorSum(RealVector rv1, RealVector rv2) {
        if(rv1.getDimension()==rv2.getDimension()) {
            RealVector v = rv1.ebeMultiply(rv2);
            double total = 0;
            for (double i : v.toArray()) {
                total += i;
            }
            return total;
        }else throw new DimensionMismatchException(rv1.getDimension(),rv2.getDimension());
    }

    public static void main(String[] args) {

        App app = new App();
        RealVector p = MatrixUtils.createRealVector(new double[]{
                3, 3, 10, 2
        });
        RealVector p1 = MatrixUtils.createRealVector(new double[]{
                3, 4, 5, 1
        });
        double x = app.realVectorSum(p,p1);

        System.out.println(x);
    }
}
