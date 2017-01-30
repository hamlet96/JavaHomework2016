package ru.spbstu.telematics.java.petrosyan.lab01;

import org.apache.commons.math3.exception.*;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealVector;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hamle_000 on 1/12/2016.
 */
public class AppTest {
    private static final double DELTA = 1e-15;
    @Test
    public void main() throws Exception {
    }

    @Test(expected = DimensionMismatchException.class)
    public void testVectorSum() {
        RealVector a = MatrixUtils.createRealVector(new double[]{
                3, 3, 10, 2
        });
        RealVector b = MatrixUtils.createRealVector(new double[]{
                3, 4, 5, 1
        });
        RealVector c = MatrixUtils.createRealVector(new double[]{
                -3, 0, 5, -1
        });
        RealVector d = MatrixUtils.createRealVector(new double[]{
                3, 4, 5, 1,6
        });
        RealVector e = MatrixUtils.createRealVector(new double[]{
                3, 0, 0, 0,6
        });
        RealVector f = MatrixUtils.createRealVector(new double[0]);
        App app = new App();
        assertEquals(73.0, app.realVectorSum(a,b),DELTA);
        assertEquals(39.0, app.realVectorSum(a,c),DELTA);
        assertEquals(45.0, app.realVectorSum(d,e),DELTA);
        assertEquals(0, app.realVectorSum(f,e),DELTA); //exception case
        assertEquals(0, app.realVectorSum(a,d),DELTA); //exception case

    }

}