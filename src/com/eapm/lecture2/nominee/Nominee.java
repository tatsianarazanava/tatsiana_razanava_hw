package com.eapm.lecture2.nominee;

import com.eapm.lecture2.award.Award;

public class Nominee {

    private String name;
    private String lastname;
    public int age;
    public boolean isMale;

    public Nominee (String n, String l, int a, boolean m){
        this.name = n;
        this.lastname = l;
        this.age = a;
        this. isMale = m;
    }

    public void receiveAward (Award award){
        System.out.println("Awa value: " + award.getValue());
    }

    public String getName() {
        return name;
    }
}

