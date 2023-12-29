package com.ohgiraffers.section02.assignment;

public class Application01 {
    public static void main(String[] args) {
        /*대입연산자와 산술 복합 대입 연산자를 이해하고 활용할 수 있다.*/
        int num = 12;
        System.out.println("num : " +num);
        //3증가시
        num = num + 3; //대입연산자의 오른쪽에는 값, 왼쪽에는 공간의 의미이다.
        System.out.println("num : " + num);
        num += 3; //num = num + 3; 과 같은 의미임
        System.out.println("num : " + num);
        num -= 5; //num = num - 5;
        System.out.println("num : " + num);
        num *= 2; //num값 2배 증가
        System.out.println("num : " + num);
        num /= 2; //num값 2배 감소
        System.out.println("num : " + num);
        /* 주의! 산술 복합 대입연산자의 작성 순서에 주의해야 한다. */
        /* 산술 대입 연산자가 아닌 '-5'를 num에 대입한 것이다. */
        num =- 5;
        System.out.println("num : " + num);

        /* 다른 연산자와 함께 증감 연산자를 사용하는 경우 */
        int firstNum = 20;
        int result1 = firstNum++ * 3;
        System.out.println("result1 : "+result1);
        System.out.println("firstNum : "+firstNum);

        int secondNum = 20;
        int result2 = ++secondNum * 3;
        System.out.println("result2 : "+result2);
        System.out.println("secondNum : "+secondNum);
    }

}
