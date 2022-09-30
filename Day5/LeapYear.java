package com.bridgelab.Day5;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = 999;

        if (a > x) {
            if ((a % 4) == 0) {
                if ((a % 100) == 0) {
                    if ((a % 400) == 0) {
                        System.out.println("Its a leap year");
                    } else
                        System.out.println("Its not a leap year");
                } else
                    System.out.println(a + " It's a Leap Year");
            } else
                System.out.println("It's not a Leap year");
        }
    }
}
