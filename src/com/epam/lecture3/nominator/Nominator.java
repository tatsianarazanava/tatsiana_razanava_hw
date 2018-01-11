package com.epam.lecture3.nominator;

import com.epam.lecture3.award.Award;
import com.epam.lecture3.nominee.Nominee;

public class Nominator {

    private String name;
    private String lastName;
    private int age;

    public Nominator(String nameParam, String lastNameParam, int ageParam) {
        this.name = nameParam;
        this.lastName = lastNameParam;
        this.age = ageParam;

    }

    public void nominate(Nominee nominee, Award award) {
        System.out.println("Recipient name is " + nominee.getName());

        nominee.receiveAward(award);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

}