package com.kodilla;


import java.lang.*;


class Calc {
    int a;
    int b;
    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add(){
        System.out.println(a+b);
    }
    public static void main(String args[]){

        Calc calc = new Calc(3, 1);
        calc.add();
    }
}
