package com.bridgelab.Day1;

public class DemonstrateSta_Var_Block {

        static int a;
        static String s;
        {
            System.out.println("Instance block");
        }

        public static void main(String[] args) {
            DemonstrateSta_Var_Block d = new DemonstrateSta_Var_Block();
            d.add(45,55);
            System.out.println("Static variables a and s value "+a + "\t " +s);

        }

        void add(int a1 , int b1){
            int sum = a1 + b1;
            System.out.println("Method add result is\t" + sum);
        }
    }

