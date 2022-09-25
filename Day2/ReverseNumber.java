package com.bridgelab.Day2;
import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an Integer to reverse");
        int i = s.nextInt();
        String str1 = "";
        String str = Integer.toString(i);
        int k = 0;
        while ( k<str.length()){
            char ch = str.charAt(k);
            str1 =  ch + str1;
            k++;
        }
        System.out.println("Reversed string using String Class\t" + str1);
        StringBuilder b = new StringBuilder(Integer.toString(i));
        System.out.println("Reversed String using String builder\t" + b.reverse());
    }
}
