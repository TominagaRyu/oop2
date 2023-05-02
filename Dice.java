package oop2;

import java.util.Random;

import static java.lang.Math.random;

public class Dice {
    public int cast() {
        Random random = new Random();
        int randomNumber = random.nextInt(6) + 1;
        //1~6のランダムな値を表示
        System.out.println(randomNumber);
        return randomNumber;
    }

    public int see() {
        int lastBool = 0;
//        if(lastBool == 1){
//            return 1;
//        }else{
//            return lastBool;
        return lastBool;
    }
}


