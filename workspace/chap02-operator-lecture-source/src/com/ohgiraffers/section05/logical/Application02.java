package com.ohgiraffers.section05.logical;

public class Application02 {
    public static void main(String[] args) {
        /*논리연산자의 우선순위에 대해 이해하고 이를 활용할 수 있다.*/

        /* 1. 1부터 100 사이의 값인지 확인 */
        int num1 = 50;
        System.out.println("1부터 100사이의 값인지 확인 : "+(num1>=1&&num1<=100));
        /* 2. 영어 대문자인지 확인 */
        char ch1 = 'G';
        System.out.println("영어 대문자인지 확인 : "+(ch1 >= 'A' && ch1 <='Z'));
        System.out.println("영어 대문자인지 확인 : "+(ch1 >= 65 && ch1 <=90));

        /* 3. 대소문자 상관 없이 영문자 y인지 확인 */
        char ch2 = 'y';
        System.out.println("영문자 y인지 확인 : "+(ch2 == 'Y'|| ch2 =='y'));

        /* 4. 영문자인지 확인(대문자 또는 소문자)
        * && 는 || 보다 우선순위가 높다.
        * */
        char ch3 = 'f';
        System.out.println("영문자인지 확인 : "+((ch3>=65&&ch3<=90)||(ch3>=97&&ch3<=102)));
    }
}
