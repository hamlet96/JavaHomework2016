package ru.spbstu.telematics.java;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hamle_000 on 1/12/2016.
 */
public class AppTest {
    @Test
    public void main() throws Exception {
    }
    @Test
    public void testVectorSum() {
        Vector a = new Vector(5,6);
        Vector b = new Vector(4,10);

        int result = App.VecSum(a,b);

        assertEquals(80, result);

    }

}