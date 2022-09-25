package com.bridgelab.Day2;
import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a single digit to print in word");
        int i = s.nextInt();
        String [] str = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        if (i<10 && i>=0){
            System.out.println(str[i]);
        }else
            System.out.println("Wrong input");
    }
}
