package com.company;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String name = "SANKET";
        System.out.println("Name in lower case : "+name.toLowerCase());

        String set = "I am      a boy";
        System.out.println(set.replace(" ", "_"));

        String letter = "Dear <|name|>, Thanks a lot";
        System.out.println(letter.replace("<|name|>","Sanket"));

        String mystring = "This string contains  double and   triple spaces";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));

        String myLetter = "Dear Sanket,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);
    }
}
