package com.nishi.java.superKeyword;

public class Child  extends Parent{
int a;
int b;
    Child(int a , int b,int c, int d)
    {
        super(c,d);
        this .a=a;
        this.b=b;
        System.out.println(this .a);
        System.out.println(this .b);//this .b);
        System.out.println(" child constructor is called ");
    }
    void f2(){
        super.f1();
        System.out.println(" inside child");

    }
}
