package com.bridgelab.Day4;

public class RollsTheDie {
    public static void main(String[] args) {
        RollsTheDie a = new RollsTheDie();
        a.rollDie();

    }
    public void rollDie(){
        int die = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("Die value is " + die);
    }

}
