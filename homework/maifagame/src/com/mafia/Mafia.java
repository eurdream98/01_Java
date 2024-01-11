package com.mafia;

import java.util.Arrays;
import java.util.Scanner;
class Mafia extends Player {
    public Mafia(String name) {
        super(name);
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("저는 마피아입니다.");
    }
}
