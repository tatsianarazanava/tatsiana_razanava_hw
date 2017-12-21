package com.epam.lecture2.nominee;

import com.epam.lecture2.award.Award;

public class Nominee {

    private String name;
    private String lastName;
    public int age;
    public boolean isMale;

    public Nominee(String n, String l, int a, boolean m) {
        this.name = n;
        this.lastName = l;
        this.age = a;
        this.isMale = m;
    }

    public void receiveAward(Award award) {
        System.out.println("Award value: " + award.getValue());
    }

    public String getName() {
        return name;
    }
}

