package com.ohgiraffers.section03.increment;

public class Application01 {
    public static void main(String[] args) {
        /* 단항으로 사용될 때는 1 증가/1 감소의 의미를 가진다. */
        int num = 20;
        System.out.println("num : " + num);
        num++; //1 증가
        System.out.println("num : " + num);
        ++num; //1 증가
        System.out.println("num : " + num);
        num--; //1 감소
        System.out.println("num : " + num);
        --num; //1 감소
        System.out.println("num : " + num);
    }
}
