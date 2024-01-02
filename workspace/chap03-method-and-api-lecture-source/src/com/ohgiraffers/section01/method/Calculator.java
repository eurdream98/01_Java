package com.ohgiraffers.section01.method;

public class Calculator {

    public int minNumberOf(int first,int second){
        return first > second ? second : first ;
    }

    public static int maxNumberOf(int first,int second){
        return first > second ? first : second;
    }

    //2개의 메소드를 Application09 클래스에서 호출해보자.
}
