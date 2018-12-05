package com.kodilla.testing.calculator;

import java.lang.*;

public class Calculator {
    Integer a;
    Integer b;
    public Calculator(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }
    public Integer add(){
        return a+b;
    }
    public Integer subtrack(){
        return a-b;
    }

}
