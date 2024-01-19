package com.ohgiraffers.section03.references;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Application01 {
    public static void main(String[] args) {
        /*메소드 참조에 대해 이해하고 사용할 수 있다.*/
        BiFunction<String,String,Boolean> biFunction;
        String str1 = "METHOD";
        String str2 = "METHO";
        biFunction = ( x,y ) -> x.equals(y);
        System.out.println(biFunction.apply(str1,str2));

        /*위의 람다식을 메소드 참조 형태로 변경*/
        biFunction = String::equals;
        System.out.println(biFunction.apply(str1,str2));

        BinaryOperator<String> bioperator = (x,y)-> x+y;

        System.out.println(bioperator.apply("ㅎㅇ","ㅇㅇ"));

        BinaryOperator<String> bioperator2 = String::concat;
        System.out.println(bioperator2.apply("gd","dd"));

    }
}
