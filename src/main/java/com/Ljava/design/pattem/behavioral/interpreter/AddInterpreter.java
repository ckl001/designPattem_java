package com.Ljava.design.pattem.behavioral.interpreter;

/**
 * @Auther 20173
 * @Date 2019-4-10 15:35
 * @Des 加法解释器
 **/
public class AddInterpreter implements Interpreter{

    private Interpreter firstExpression, secondExpression;

    public AddInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret(){
        return this.firstExpression.interpret() + this.secondExpression.interpret();
    }

    public String toString(){
        return "+";
    }

}
