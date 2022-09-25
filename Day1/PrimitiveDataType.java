package com.bridgelab.Day1;

public class PrimitiveDataType {
    static  byte a;
    static boolean a1;
    static short a2;
    static int a3;
    static long a4;
    static float a5;
    static double a6;
    static char a7 ;

    public static void main(String[] args) {
        byte b = 10;
        boolean b1 = 7>6;
        short b2 = 1234;
        int b3 = 123456;
        long b4 = 123456789L;
        float b5 = 12345.15464f;
        double b6 = 122132434.151564;
        char b7 = 'A';
        System.out.println("byte " + b + "\t\t"  + " boolean "+ b1 + "\t\t"  + "short " + b2 + "\t\t"
                + "int " + b3+ "\t\t"  + "long " + b4 + "\t\t"  +"float " + b5 + "\t\t"  + "double " + b6 + "\t\t"  + "char " + b7);
        System.out.println("byte " + a + "\t\t"  + " boolean "+ a1 + "\t\t"  + "short " + a2 + "\t\t"
                + "int " + a3+ "\t\t"  + "long " + a4 + "\t\t"  +"float " + a5 + "\t\t"  + "double " + a6 + "\t\t"  + "char " + a7);
    }
}
