package com.company;
import java.util.Scanner;

public class ConvertKiloToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Kilometers : ");
        double kilo = sc.nextInt();
        double mile = (kilo * 0.62137);
        System.out.println("The kilometer "+kilo+" is equal to mile "+mile);
    }
}
