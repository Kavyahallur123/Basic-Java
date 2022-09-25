package com.bridgelab.Day2;
import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a value for n");
        int s1 = s.nextInt();
        int Sum = 0,k;
        for (k=0;k<=s1;k++){
            Sum += k;
        }
        System.out.println("Sum of N numbers is " + Sum);
    }
}
