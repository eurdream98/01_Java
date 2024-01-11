package com.mafia;

// 경찰 클래스 (플레이어의 하위 클래스)
class Police extends Player {
    public Police(String name) {
        super(name);
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("저는 경찰입니다.");
    }
}
