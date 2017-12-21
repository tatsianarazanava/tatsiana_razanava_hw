package com.epam.lecture2.award;

public class Award {

    public String title;
    private int value;
    private boolean isCash;

    public Award(String t, final int v, boolean c) {
        this.title = t;
        this.value = v;
        this.isCash = c;
    }

    public int getValue() {
        return value;

    }

}
