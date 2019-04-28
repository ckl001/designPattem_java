package com.Ljava.design.pattem.behavioral.interpreter;

/**
 * @Auther 20173
 * @Date 2019-4-10 15:41
 * @Des 数字解释器
 **/
public class NumberInterpreter implements Interpreter{

    private int number;
    public NumberInterpreter(int number){
        this.number=number;
    }
    public NumberInterpreter(String number){
        this.number=Integer.parseInt(number);
    }
    @Override
    public int interpret(){
        return this.number;
    }

}
