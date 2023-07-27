package com.qa;

public class TestCalc {
    public static void main(String[] args){
        BadCalc bc = new BadCalc();
        System.out.println("mul result:"+bc.mult(2,3));
        try {
            System.out.println("div result:" + bc.div(6, 0));
        }catch (ArithmeticException ae){
            System.out.println("Calculation error caught");
        }
        MyConsoleReader mcr = new MyConsoleReader();
        mcr.readInputPrint();
    }
}
