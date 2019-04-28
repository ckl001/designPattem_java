package com.Ljava.design.pattem.structural.adapter.singleEg;

/**
 * @Auther 20173
 * @Date 2019-4-9 11:58
 * @Des 交流电 220V
 **/
public class AC220 {

    public int outputAC220V(){
        int output = 220;
        System.out.println("输出交流电" + output + "V");
        return output;
    }

}
