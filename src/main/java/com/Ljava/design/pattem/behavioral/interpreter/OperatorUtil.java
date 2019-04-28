package com.Ljava.design.pattem.behavioral.interpreter;

/**
 * @Auther 20173
 * @Date 2019-4-10 15:31
 * @Des 操作 工具类
 **/
public class OperatorUtil {

    //检查是否为符号
    public static boolean isOperator(String symbol){
        return symbol.equals("+") || symbol.equals("*");
    }


    public static Interpreter getExpressionObject(Interpreter firstExpression, Interpreter secondExpression, String symbol){
        if (symbol.equals("+")) {
            return new AddInterpreter(firstExpression, secondExpression);
        } else if (symbol.equals("*")) {
            return new MultiInterpreter(firstExpression, secondExpression);
        }
        return  null;
    }

}
