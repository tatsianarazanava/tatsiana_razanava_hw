package com.eapm.lecture2.nominator;

import com.eapm.lecture2.award.Award;
import com.eapm.lecture2.nominee.Nominee;

public class Nominator {

    private String name;
    private String lastname;
    public int age;
    public boolean isMale;

    public Nominator (String n, String l, int a, boolean m) {
        this.name = n;
        this.lastname = l;
        this.age = a;
        this.isMale = m;
    }

    public void nominate (Nominee nominee, Award award) {
        System.out.println("nominee name is " + nominee.getName());

        nominee.receiveAward(award);
    }


}