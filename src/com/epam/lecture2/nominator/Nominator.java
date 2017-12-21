package com.epam.lecture2.nominator;

import com.epam.lecture2.award.Award;
import com.epam.lecture2.nominee.Nominee;

public class Nominator {

    private String name;
    private String lastName;
    public int age;
    public boolean isMale;

    public Nominator(String n, String l, int a, boolean m) {
        this.name = n;
        this.lastName = l;
        this.age = a;
        this.isMale = m;
    }

    public void nominate(Nominee nominee, Award award) {
        System.out.println("Nominee name is " + nominee.getName());

        nominee.receiveAward(award);
    }


}