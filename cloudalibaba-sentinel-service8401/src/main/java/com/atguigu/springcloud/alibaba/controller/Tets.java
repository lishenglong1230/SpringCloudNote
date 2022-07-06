package com.atguigu.springcloud.alibaba.controller;

/**
 * @Author: Lishenglong
 * @Date: 2022/4/9 16:44
 */
public class Tets {
    static int num1=55;
    static int num2=66;
    public static void f1(int num,int num1){
        num=100;
        num1 =100;
        num2=100;

        System.out.println(num);//100
        System.out.println(num1);//100
        System.out.println(num2);//100
    }

    public static void main(String[] args) {
        f1(num1,num2);
        System.out.println(num1);//55
        System.out.println(num2);//100
    }


}
