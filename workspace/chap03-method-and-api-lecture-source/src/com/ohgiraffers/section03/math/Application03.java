package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application03 {
    public static void main(String[] args) {
        /* java.util.Random 클래스를 활용하여 사용자 지정 범위의 난수를 발생시킬 수 있다.
        * nextInt(int bound) : 0부터 매개변수로 전달 받은 정수 범위까지의 난수를 발생시켜 정수 형태로 변환
        * Math와 다르게 static이 아니다.(객체화 과정 필요)
        * 공식 : random.nextInt(구하려는 난수의 갯수)+구하려는 난수의 최소 값
        * */
        Random r = new Random();

        /* 1. 0~9 범위의 난수 발생 */
        int randomNumber1 = r.nextInt(10);
        System.out.println("0에서 9까지의 난수 : "+randomNumber1);


        /* 2. 1 ~ 10 범위의 난수 발생 */
        int randomNumber2 = r.nextInt(10)+1;
        System.out.println("1에서 10까지의 난수 : "+randomNumber2);

    }
}
