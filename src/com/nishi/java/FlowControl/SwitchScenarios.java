package com.nishi.java.FlowControl;

public class SwitchScenarios {
    public static void main(String[] args) {
        int a=10;
        final int b=20;
        switch(a)
        {
            case 10:
                System.out.println(a);
                break;
            case b:
                System.out.println(b);
                break;
        }
    }
}
