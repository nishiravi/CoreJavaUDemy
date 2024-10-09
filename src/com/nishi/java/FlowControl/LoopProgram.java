package com.nishi.java.FlowControl;

public class LoopProgram {
    public static void main(String[] args) {

        int n = 150;
        for (int i = 1; i <= n; i++) {
            if (i % 10 == 0) {
                continue;
            }
            if (i > 100)
                break;
            System.out.println(i);
        }
        System.out.println(" while loop starts");
        int k=0;
        while(k<n){
            k++;
            if (k % 10 == 0) {
                continue;
            }
            if (k > 100)
                break;
            System.out.println(k);

        }
        System.out.println(" do while loop starts");
        int j=0;
        do {
            j++;
            if (j % 10 == 0) {
                continue;
            }
            if (j> 100)
                break;
                System.out.println(j);

        }while(j<n);

    }
}
