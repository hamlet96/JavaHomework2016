package ru.spbstu.telematics.java.petrosyan.lab03;

import java.util.Random;

/**
 * Created by hamle_000 on 2/3/2017.
 */
class MyThread extends Thread{

    public int start;
    public int end;

    MyThread(int a, int b){
        start = a;
        end = b;
    }
    @Override
    public void run(){
        int myn = new Random().nextInt(1000); //thread name
        for(int i=start;i<end;i++){
            int sum = 0;
            for(int j=0;j<App.arr.length;j++)
            {
                sum+=App.arr[i][j];
            }
            App.res[i]=sum/App.arr.length;

            System.out.format("Thread: %d Number: %d Value: %d%n", myn,i,App.res[i]);
        }
    }
}
public class App {
    public volatile static int[][]arr;
    public volatile static int[]res;
    public static final int size = 10000;
    public static void main( String[] args ) throws InterruptedException {
        arr = new int [size][size];
        res = new int [size];


        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++)
                arr[i][j]= new Random().nextInt(100);
        }
        MyThread t1 = new MyThread(0,10000);
        MyThread t2 = new MyThread(5000,10000);


        t1.start();
        t2.start();

    }
}
