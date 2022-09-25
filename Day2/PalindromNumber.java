package com.bridgelab.Day2;
import java.util.Scanner;

        public class PalindromNumber {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter an Integer to reverse");
            int i = s.nextInt();
            String str1 = "";
            String str = Integer.toString(i);
            for (int k = 0; k < str.length(); k++) {
                char ch = str.charAt(k);
                str1 = ch + str1;
            }
            if (str.equals(str1)) {
                System.out.println(str + " It is a palindrome number\t" + str1);
            }
            else
                System.out.println("Its not a palindrome " + str1);

        }
    }

