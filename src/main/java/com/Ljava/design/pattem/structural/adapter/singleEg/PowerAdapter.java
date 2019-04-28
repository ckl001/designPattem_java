package com.Ljava.design.pattem.structural.adapter.singleEg;

/**
 * @Auther 20173
 * @Date 2019-4-9 12:10
 * @Des 电流适配器
 **/
public class PowerAdapter implements DC5{

    public AC220 ac220 = new AC220();

    /**
     * 220V 交流电转 5V直流电
     * @return
     */
    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用PowerAdapter输入AC:"+adapterInput+"V"+"输出DC:"+adapterOutput+"V");
        return adapterOutput;
    }
}
