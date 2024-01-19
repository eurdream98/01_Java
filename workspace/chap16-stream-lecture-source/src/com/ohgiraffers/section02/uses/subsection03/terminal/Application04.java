package com.ohgiraffers.section02.uses.subsection03.terminal;

import java.util.Arrays;
import java.util.List;

public class Application04 {
    public static void main(String[] args) {
        /*최종 연산 중 하나인 match에 대해 이해하고 사용할 수 있다.*/
        List<String> stringList = Arrays.asList("Java","Spring","SpringBoot");

        boolean anyMatch = stringList.stream().anyMatch(str->str.contains("가"));
        boolean allMatch = stringList.stream().allMatch(str->str.length()>3);
        boolean noneMatch = stringList.stream().noneMatch(str->str.contains("S"));

        System.out.println("anyMatch : "+anyMatch);
        System.out.println("allMatch : "+allMatch);
        System.out.println("noneMatch : "+noneMatch);
    }
}
