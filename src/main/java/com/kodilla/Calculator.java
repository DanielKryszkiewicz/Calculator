package com.kodilla;

public class Calculator {

    int a;
    int b;
    public void sum(){
        System.out.println(a+b);
    }
    public void sub(){
        System.out.println(a-b);
    }

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    public static void main(String[] args){
        Calculator calculator = new Calculator(5,5);

        calculator.sub();
        calculator.sum();

    }
}

