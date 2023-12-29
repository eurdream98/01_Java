package com.ohgiraffers.section01.method;

public class Application02 {
    /* 다른 호출의 메소드 호출에 대해 이야기할 수 있다. */
    public static void main(String[] args) {
        System.out.println("main 메소드 시작됨...");

        Application02 app2 = new Application02();
        app2.methodA();
        app2.methodC();
        app2.methodC();
        System.out.println("main 메소드 종료됨...");
    }

    public void methodA(){
        System.out.println("methodA 호출됨...");
        System.out.println("methodA 반환됨...");
    }
    public void methodB(){
        System.out.println("methodB 호출됨...");
        System.out.println("methodB 반환됨...");
    }
    public void methodC(){
        System.out.println("methodC 호출됨...");
        System.out.println("methodC 반환됨...");
    }
}
