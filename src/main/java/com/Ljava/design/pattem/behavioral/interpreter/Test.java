package com.Ljava.design.pattem.behavioral.interpreter;


import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
/**
 * @Auther 20173
 * @Date 2019-4-10 15:52
 * @Des TODO
 **/
public class Test {

    public static void main(String[] args) {
        String ckInputStr = "88 99 11 12 + * +";
        CKExpressionParser ckExpressionParser = new CKExpressionParser();
        int result = ckExpressionParser.parse(ckInputStr);
        System.out.println("计算结果：" + result);


//        Spring Expression 包使用的解释器模式
//        ExpressionParser parser = new SpelExpressionParser();
//        Expression expression = parser.parseExpression("100 * 2 + ( 400 * 1 ) + 66");
//        int result = (Integer) expression.getValue();
//        System.out.println(result);
    }
}
