package com.ohgiraffers.section01.method;

public class Application07 {
    public static void main(String[] args) {
        /* 매개변수와 리턴 값을 복합적으로 활용해볼 수 있다.*/

        int first = 10;
        int second = 20;

        Application07 app07 = new Application07();

        System.out.println("두 수를 더한 결과 : "+app07.plusTwoNumbers(first,second));
        System.out.println("두 수를 뺀 결과 : "+app07.minusTwoNumbers(first,second));
        System.out.println("두 수를 곱한 결과 : "+app07.multipleTowNumbers(first,second));
        System.out.println("두 수를 나눈 결과 : "+app07.divideTowNumbers(first,second));

    }
    public int plusTwoNumbers(int first,int second){
        return first+second;
    }
    public int minusTwoNumbers(int first, int second){
        return first-second;
    }

    public int multipleTowNumbers(int first, int second){
        return first*second;
    }
    public int divideTowNumbers(int first,int second){
        return first/second;
    }
}
