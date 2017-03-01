package ru.spbstu.telematics.java.petrosyan.lab01;

import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.exception.*;

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
}
