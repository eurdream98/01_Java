package com.ohgiraffers.level02.basic;

import java.util.Random;

public class RandomMaker {
    public static int randomNumber(int min,int max){
        if(max>=min){
        int result = (int)(Math.random()*(max-min+1))+min;
        return result;
        }
        else{
            int result = (int)(Math.random()*(min-max+1))+min;
            return result;
        }
        }

    public static String rockPaperScissors(){
        Random r = new Random();
        int num = r.nextInt(3);
        String result = num>0 ? num==1 ? "가위":"바위" : "보";
    return result;
    }

    public static String tossCoin(){
        Random r = new Random();
        int num = r.nextInt(2);
        String result = num==0?"앞면":"뒷면";
        return result;
    }
}

