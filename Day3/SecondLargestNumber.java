package com.bridgelab.Day3;
/*Find 2nd Largest Number in an Array*/
import java.util.Arrays;

public class SecondLargestNumber {

    public static void main(String[] args) {
            int[] arr = new int[]{1, 2, 45, 7, 8, 4, 0, 8, 7, 3};
            int n = arr.length;
            Arrays.sort(arr);
            int second;
            int largest = second = Integer.MIN_VALUE;
            System.out.println("Second largest value "+arr[n-2]);

            //another way
            for (int i = 0; i <n ; i++) {
                largest = Math.max(largest,arr[i]);
            }
            for (int i = 0; i < n; i++) {
                if (arr[i]!=largest){
                    second = Math.max(second,arr[i]);
                }
            }
            System.out.println("Second largest is\t" + second);
        }
}
