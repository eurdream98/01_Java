package com.section05;

public class P {
    int x = 100;
    public P() {
        this(500);
    }

    public P(int x) {
        this.x = x;
    }


    int getX(){
        return x;
    }
}
