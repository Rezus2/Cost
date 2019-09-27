package com.company;

import java.util.Scanner;

public class Cost {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int n=in.nextInt();
        int x=a*n;
        int e=b*n;
        if (e>100) {
           x=x+(e/100);
           e=(e%100);
        }
        System.out.println(x+" "+e);
    }
}
