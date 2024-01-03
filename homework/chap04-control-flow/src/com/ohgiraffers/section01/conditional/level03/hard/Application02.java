package com.ohgiraffers.section01.conditional.level03.hard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application02 {
    /* 과일 이름("사과", "바나나", "복숭아", "키위") 중 한 가지를 문자열로 입력하면
     * 해당하는 가격에 맞게 상품명과 가격이 출력되게 하세요.
     * 단, 목록에 없는 과일을 입력 시 "준비된 상품이 없습니다." 출력 후 프로그램 종료
     *
     * -- 상품 가격 --
     * 사과 :  1000원
     * 바나나 : 3000원
     * 복숭아 : 2000원
     * 키위 : 5000원
     *
     * -- 입력 예시 --
     * 과일 이름을 입력하세요 : 바나나
     *
     * -- 출력 예시 --
     * 바나나의 가격은 3000원 입니다.
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("과일 이름을 입력하세요 :");
        String name = br.readLine();
        int price = 0;
        switch (name){
            case "사과":
                price = 1000;
                break;
            case "바나나":
                price = 3000;
                break;
            case "복숭아":
                price = 2000;
                break;
            case "키위":
                price = 5000;
                break;
            default:
                System.out.println("준비된 상품이 없습니다.");
        }
        if(price!=0) {
            System.out.println(name + "의 가격은 " + price + "원 입니다.");
        }
    }

}
