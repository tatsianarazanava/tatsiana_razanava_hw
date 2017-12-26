package com.epam.lecture2.nominee;

import com.epam.lecture2.award.Award;

public class Nominee {

    private String name;
    private String lastName;
    private int age;
    private boolean isMale;

    public Nominee(String nameParam, String lastNameParam, int ageParam, boolean isMaleParam) {
        this.name = nameParam;
        this.lastName = lastNameParam;
        this.age = ageParam;
        this.isMale = isMaleParam;
    }

    static {
        System.out.println("Recipient initialized");
    }

    public void receiveAward(Award award) {
        System.out.println("Award value: " + award.getValue());
    }

    public String getName() { return name; }


}


