package com.bridgelab.Day3;


    /*Java Program to print the duplicate elements of an array*/
    public class DuplicateElements {
        public static void main(String[] args) {
            int[] a = {0, 2, 2, 3, 4, 5, 5,6,6};
            for (int i = 0; i < a.length; i++)
            {
                for (int j = i+1; j < a.length ; j++)
                {
                    if(a[i] ==a[j])
                    {
                        System.out.println(a[j]);
                    }
                }
            }
        }
    }

