package com.mafia;

public class Citizen extends Player{
    public Citizen(String name) {
        super(name);
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("저는 시민입니다.");
    }
}
