package com.bridgelab.Day2;
import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        String[] s2 = {"One", "Ten", "Hundred", "Thousand"};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1/10/100/1000 to print in word");
        int i = s.nextInt();
        if (i == 1) {
            System.out.println(s2[0]);
        } else if (i == 10) {
            System.out.println(s2[1]);
        } else if (i == 100) {
            System.out.println(s2[2]);
        } else if (i == 1000) {
            System.out.println(s2[3]);
        }else
            System.out.println("Not among 1/10/100/1000 this");
    }

}
