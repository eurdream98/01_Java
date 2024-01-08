package com.ohgiraffers.section02.encapsulation.problem3;

public class Application {
    public static void main(String[] args) {
        /* 필드에 직접 접근 시 발생하는 문제를 해결하는 방법을 이해하고 적용할 수 있다. */

        /* Monster 클래스의 필드를 name -> kinds로 변경하면 setInfo,getInfo 메소드 내의 코드는 변경이 필요하다.
        * 하지만 사용자의 호출 코드는 변경하지 않아도 된다. 따라서 유지보수성이 향상된다. */
        Monster m1 = new Monster();
        m1.setInfo("드라큘라");
        m1.setHp(100);

        Monster m2 = new Monster();
        m2.setInfo("늑대인간");
        m2.setHp(200);

        Monster m3 = new Monster();
        m3.setInfo("미이라");
        m3.setHp(300);


        System.out.println(m1.getInfo());
        System.out.println(m2.getInfo());
        System.out.println(m3.getInfo());

        m3.kinds = "두치";
        m3.hp = -200;
        System.out.println("monster3 kinds : "+m3.kinds);
        System.out.println("monster3 hp : "+m3.hp);
        // ==> 메소드를 통해 필드에 간접접근 하는 방법은 만들었으나, 여전히 직접 접근이 가능한 상태이므로
        // 직접접근이 불가하게 강제화하는 처리가 필요하다.
    }
}
