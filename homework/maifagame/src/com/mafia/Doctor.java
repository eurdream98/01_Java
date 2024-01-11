package com.mafia;

class Doctor extends Player {
    public Doctor(String name) {
        super(name);
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("저는 의사입니다.");
    }
}
