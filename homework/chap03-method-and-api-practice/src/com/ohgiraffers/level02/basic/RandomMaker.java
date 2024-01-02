package com.ohgiraffers.level02.basic;

import java.util.Random;

public class RandomMaker {
    public static int randomNumber(int min, int max) {
        int result = max >= min ? (int) (Math.random() * (max - min)) + min : (int) (Math.random() * (min - max)) + max;
        return result;
    }

    public static String randomUpperAlphabet(int length) {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char alpha = (char) (r.nextInt(26) + 65);
            sb.append(alpha);
        }
        return sb.toString();
    }

    public static String rockPaperScissors() {
        Random r = new Random();
        int num = r.nextInt(3);
        String result = num > 0 ? num == 1 ? "가위" : "바위" : "보";
        return result;
    }

    public static String tossCoin() {
        Random r = new Random();
        int num = r.nextInt(2);
        String result = num == 0 ? "앞면" : "뒷면";
        return result;
    }
}

