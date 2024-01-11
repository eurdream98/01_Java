package com.mafia;

public class Player {
    protected String name;
    protected boolean alive;

    public Player(String name) {
        this.name = name;
        this.alive = true;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void introduce() {
        System.out.println("제 이름은 " + name + "입니다.");
    }
}
