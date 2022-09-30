package com.bridgelab.Day5;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to check whether its even or odd");
        int num = s.nextInt();

        if (num % 2 == 0) {
            System.out.println("Entered Number is Even");
        }

        else {
            System.out.println("Entered Number is Odd");
        }
    }
}
