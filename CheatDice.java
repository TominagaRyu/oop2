package oop2;

import java.util.Random;
public class CheatDice extends Dice {
    private static int count = 0;

    @Override
    public int cast(){
        count++;
        if(count % 6 == 0){
            return 6;
        }else{
            return super.cast();
        }
    }

    @Override
    public int see(){
        if(count == 0){
            return 1;
        } else if (count % 6 == 0) {
            return 6;
        }else{
            return super.see();
        }
    }
}
