package com.company;
import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Sum is "+(a+b+c));
    }
}
