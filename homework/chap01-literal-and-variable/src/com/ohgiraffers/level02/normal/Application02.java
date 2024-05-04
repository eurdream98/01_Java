package com.ohgiraffers.level02.normal;

public class Application02 {
    public static void main(String[] args) {
        double korean = 80.5;
        double math = 50.6;
        double english = 70.8;

        int sum = (int)(korean+math+english);
        int average = sum/3;

        System.out.println("총점 : "+sum);
        System.out.println("평균 : "+average);

    }
}
