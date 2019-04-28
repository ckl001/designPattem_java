package com.Ljava.design.pattem.behavioral.interpreter;

import java.util.Stack;

/**
 * @Auther 20173
 * @Date 2019-4-10 15:28
 * @Des 解释器
 **/
public class CKExpressionParser {
    private Stack<Interpreter> stack = new Stack<>();

    public int parse(String str){
        String[] strItemArray = str.split(" ");
        for(String symbol: strItemArray){
            if(!OperatorUtil.isOperator(symbol)){ //是否为符号
                Interpreter numberExpression = new NumberInterpreter(symbol);
                stack.push(numberExpression); //将数字放进栈中
                System.out.println(String.format("入栈: %d", numberExpression.interpret()));
            }else {
                //是运算符号，可以计算
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                System.out.println(String.format("出栈: %d 和 %d", firstExpression.interpret(), secondExpression.interpret()));

                //入参 （数值， 数值， 符号）
                Interpreter operator = OperatorUtil.getExpressionObject(firstExpression, secondExpression, symbol);
                int result = operator.interpret();
                System.out.println("运算结果：" + result);
                NumberInterpreter resultExpression = new NumberInterpreter(result);
                stack.push(resultExpression);//将=结果放进去栈中，继续运算
                System.out.println(String.format("阶段结果入栈: %d", resultExpression.interpret()));
            }
        }

        int result = stack.pop().interpret();
        return result;
    }
}
