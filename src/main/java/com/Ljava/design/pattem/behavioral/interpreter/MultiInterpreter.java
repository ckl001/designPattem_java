package com.Ljava.design.pattem.behavioral.interpreter;

/**
 * @Auther 20173
 * @Date 2019-4-10 15:39
 * @Des 乘法解释器
 **/
public class MultiInterpreter implements Interpreter{
    private Interpreter firstExpression,secondExpression;
    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpression){
        this.firstExpression=firstExpression;
        this.secondExpression=secondExpression;
    }
    @Override
    public int interpret(){
        return this.firstExpression.interpret()*this.secondExpression.interpret();
    }
    @Override
    public String toString(){
        return "*";
    }

}
