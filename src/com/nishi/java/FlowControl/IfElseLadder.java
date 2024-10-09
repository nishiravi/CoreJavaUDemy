package com.nishi.java.FlowControl;

import java.util.Scanner;

public class IfElseLadder {
    public static void main(String[] args) {

        // Session :78 program
        Scanner sc=new Scanner(System.in);
        String choice=sc.next();
        if (choice.equalsIgnoreCase("checkBalance")){
            System.out.println(" check balance");
        } else if (choice.equalsIgnoreCase("changepin")) {
            System.out.println(" change pin");
        }else if (choice.equalsIgnoreCase("withdrawcash ")) {
            System.out.println(" withdraw cash ");
        }else if (choice.equalsIgnoreCase("depositcheck ")) {
            System.out.println(" deposit check ");
        }else {
            System.out.println(" time out ");
        }
    }
}
