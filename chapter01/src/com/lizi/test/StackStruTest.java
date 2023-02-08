package com.lizi.test;

public class StackStruTest {
    public static void main(String[] args) {
        // int i = 2 + 3;
        /*int a = 2;
        int b = 3;
        int c = a + b;*/
        StackStruTest stackStruTest = new StackStruTest();
        stackStruTest.calc();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }
    public int calc(){
        int a = 100;
        int b = 200;
        int c = 300;
        return (a+b)*c;

    }
}
