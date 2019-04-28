package com.Ljava.design.pattem;

/**
 * @Auther 20173
 * @Date 2019-4-22 9:25
 * @Des TODO
 **/
public class win_exe {

    public static void main(String[] args) {
        Runtime rn = Runtime.getRuntime();
        Process p = null;
        try{
           String command = "C:\\Program Files (x86)\\Tencent\\WeChat\\WeChat.exe";
           p = rn.exec(command);
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}
