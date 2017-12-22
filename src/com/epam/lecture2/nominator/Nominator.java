package com.epam.lecture2.nominator;

import com.epam.lecture2.award.Award;
import com.epam.lecture2.nominee.Nominee;

public class Nominator {

    private String name;
    private String lastName;
    private int age;
    private boolean isMale;

    public Nominator(String nameParam, String lastNameParam, int ageParam, boolean isMaleParam) {
        this.name = nameParam;
        this.lastName = lastNameParam;
        this.age = ageParam;
        this.isMale = isMaleParam;
    }

    public void nominate(Nominee nominee, Award award) {
        System.out.println("Recipient name is " + nominee.getName());

        nominee.receiveAward(award);
    }


}