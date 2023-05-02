package oop2;

public class DiceTest {
    public static void main(String[] args) {
        Dice dice = new Dice();
        for (int i = 0; i < 30; i++) {
            int result = dice.cast();
            System.out.println("cast: " + result);
            int lastResult = dice.see();
            System.out.println("Last: " + lastResult);
            System.out.println();
        }
    }
}