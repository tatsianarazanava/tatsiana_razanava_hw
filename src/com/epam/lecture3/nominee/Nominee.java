package com.epam.lecture3.nominee;

import com.epam.lecture3.award.Award;

public class Nominee {

    private String name;
    private String lastName;
    private int age;

    public Nominee(String nameParam, String lastNameParam, int ageParam) {
        this.name = nameParam;
        this.lastName = lastNameParam;
        this.age = ageParam;

    }

    public void receiveAward(Award award) {
        System.out.println("Old award value: " + award.getValue() + "\n"
                + "New award value with soli: " + award.getValue()*award.getSoli() + "\n"
                + "soli = " + award.getSoli() + "\n" + "difference = "
                +(Math.abs(((award.getValue() - (award.getValue() * award.getSoli())) / award.getValue() * 100))) + "%" + "\n");


    }

    public String getName() { return name; }


}


