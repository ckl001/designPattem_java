package com.Ljava.design.pattem.structural.flyweight;

/**
 * @Auther 20173
 * @Date 2019-4-9 16:40
 * @Des TODO
 **/
public class Test {

    private static final String departments[] = {"RD","QA","PM","BD"};

    public static void main(String[] args) {
        for(int i=0; i<20; i++){
            String department = departments[(int)(Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();

        }
    }


}
