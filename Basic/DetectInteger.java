package com.company;
import java.util.Scanner;
public class DetectInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        boolean no = sc.hasNextInt();
        System.out.println(no);
    }
}
