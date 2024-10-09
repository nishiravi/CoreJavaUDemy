package com.nishi.java.superKeyword;

public class Parent {
    int a;
    int b;
    Parent(int a , int b)
    {
        this .a=a;
        this.b=b;
        System.out.println(this .a);
        System.out.println(this .b);//this .b);
        System.out.println(" parent constructor is called ");
    }
    void f1() {
        System.out.println(" f1 of parent class");
    }
}
