package com.nc.autumn2020.lesson3;

public class BoxUnbox implements Runnable{
    public BoxUnbox() {


    }

    public void run() {
        Integer value = 128;
        Integer value2 = 128;
        System.out.println(value==value2);
    }
}
