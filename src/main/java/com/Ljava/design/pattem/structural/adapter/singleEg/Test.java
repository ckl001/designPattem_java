package com.Ljava.design.pattem.structural.adapter.singleEg;

/**
 * @Auther 20173
 * @Date 2019-4-9 12:13
 * @Des TODO
 **/
public class Test {

    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();
    }
}
