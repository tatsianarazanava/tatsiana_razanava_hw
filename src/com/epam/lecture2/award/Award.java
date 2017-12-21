package com.epam.lecture2.award;

public class Award {

    public String title;
    private int value;
    private boolean iscash;

    public Award(String t, final int v, boolean c){
        this.title = t;
        this.value = v;
        this.iscash = c;
    }

    public int getValue (){
        return value;

    }

}
