package com.ohgiraffers.levle01.basic;

public class Calculator {

    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10(){
        int num1 = 0;
        for(int i = 1 ; i<11; i++){
            num1+=i;
        }
        return num1;
    }

    public void checkMaxNumber(int a, int b){
        int result = a>=b? a:b;
        System.out.println("두 수 중 큰 수는 "+result+"이다.");
    }

    public int sumTwoNumber(int a, int b){
        return a+b;
    }

    public int minusTwoNumber(int a,int b){
        if(a>=b){
            return a-b;
        }else{
            return b-a;
        }
    }
}
