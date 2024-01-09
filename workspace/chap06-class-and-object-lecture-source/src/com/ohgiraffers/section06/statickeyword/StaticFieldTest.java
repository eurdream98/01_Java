package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest {

    /*non-static field와 static field 선언*/
    private int nonStaticCount;
    private static int staticCount;

    public int getNonStaticCount(){
        return this.nonStaticCount;
    }
    public int getStaticCount(){
        return StaticFieldTest.staticCount;
    }

    /* 두 필드의 값을 1씩 증가시키기 위한 용도의 메소드 */
    public void increaseNonStaticCount(){
        this.nonStaticCount++;
    }

    public void increaseStaticCount(){
        StaticFieldTest.staticCount++;
    }


    /*인스턴스 변수의 경우 sft1와 sft2 두 개의 인스턴스가 생성 될 때마다 새로운 공간 heap영역에 할당되어 0으로 초기화 된다.
    * static변수의 경우 sft1과 sft2가 모두 static영역에 할당 된 하나의 공간을 공유하므로 증가 된 값 1로 출력 된다.*/


}
