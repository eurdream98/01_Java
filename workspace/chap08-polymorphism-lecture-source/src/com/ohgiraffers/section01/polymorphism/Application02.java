package com.ohgiraffers.section01.polymorphism;

public class Application02 {
    public static void main(String[] args) {
        /*다형성을 적용하여 객체 배열을 만들어 인스턴스를 연속 처리할 수 있다.*/
        Animal[] animals = new Animal[5];
        animals[0]=new Rabbit();
        animals[1]=new Tiger();
        animals[2]=new Rabbit();
        animals[3]=new Tiger();
        animals[4]=new Rabbit();

        /*Animal 클래스가 가지는 메소드를 오버라이딩한 메소드가 호출 된다. - 동적 바인딩*/
        for(Animal a:animals){
            a.cry();
        }

        /*각 타입별 고유한 메소드를 동자시키기 위해서는 다운 캐스팅이 명시적으로 필요하다.
        * ClassCastException을 방지하기 위해 instanceof 연산자를 활용한다.*/
        for(Animal a:animals){
            if(a instanceof Rabbit){
                ((Rabbit)a).jump();
            }else if(a instanceof Tiger){
                ((Tiger)a).bite();
            }else{
                System.out.println("토끼나 호랑이가 아닙니다.");
            }
        }
    }
}
