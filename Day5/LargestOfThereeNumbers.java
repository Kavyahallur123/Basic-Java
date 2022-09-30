package com.bridgelab.Day5;
import java.util.Scanner;

public class LargestOfThereeNumbers {
    static int biggestOfThree(int x, int y, int z)
    {

        return Math.max(z, (Math.max(x, y)));//or using ternary operator z > (x > y ? x : y) ? z : ((x > y) ? x : y)
    }

    public static void main(String[] args)
    {
        int a, b, c,largest;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        largest = biggestOfThree(a, b, c);

        System.out.println(largest + " is the largest number.");
    }
}
