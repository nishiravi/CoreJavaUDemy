package com.nishi.java.FlowControl;

public class DoWhile {
    public static void main(String[] args) {
        int i=1;
        do{

            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }while(i<30);
        // INFINITE LOOP is bellow
//        // do
//        {
//            statements;
//        }while(true)
    }
}
