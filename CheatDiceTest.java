package oop2;

public class CheatDiceTest {
    public static void main(String[] args) {
        CheatDice cheatDice = new CheatDice();
        for (int i = 0; i < 30; i++) {
            int result = cheatDice.cast();
            System.out.println("cast: " + result);
            int lastResult = cheatDice.see();
            System.out.println("last: " + lastResult);
        }
    }
}