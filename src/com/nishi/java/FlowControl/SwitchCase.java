package com.nishi.java.FlowControl;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String choice=sc.next();
        switch(choice){
            case "checkBalance":
                System.out.println("checkBalance");
                break;
            case "changepin":
                System.out.println("changepin");
                break;

            case "withdrawcash":
                System.out.println("withdrawcash");
                break;

            case "depositcheck":
                System.out.println("depositcheck");
                break;

            default:
                System.out.println("timeout");

        }
    }
}
