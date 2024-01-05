package com.ohgiraffers.section01.array;

import java.util.Arrays;
import java.util.Scanner;

public class Application04 {
    public static void main(String[] args) {
        /* 5명의 자바 점수를 정수로 입력 받아서 합계와 평균을 실수로 구하는 프로그램 */

        int[] scores  = new int[5];

        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i<scores.length ; i++){
            System.out.println((i+1)+"번째 학생의 자바 점수 입력 : ");
            scores[i]=sc.nextInt();
        }

        int sum = 0;
        double avg = 0.0;

        for(int i = 0 ; i<scores.length;i++){
            sum+=scores[i];
        }
        System.out.println("5명의 자바 점수의 합계 : "+ sum);

        avg = (double)sum/scores.length;
        System.out.println("5명의 자바 점수의 평균 : "+avg);

    }
}
