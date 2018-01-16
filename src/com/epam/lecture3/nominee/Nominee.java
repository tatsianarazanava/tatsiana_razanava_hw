package com.epam.lecture3.nominee;

import com.epam.lecture3.award.Award;

public class Nominee {

    private String name;
    private String lastName;
    private int age;
    private int nomineeAwardQuantityLimit;
    private double nomineeAwardAmountLimit;

    //constructor for Recipient (1)
    public Nominee(String nameParam, String lastNameParam, int ageParam) {
        this.name = nameParam;
        this.lastName = lastNameParam;
        this.age = ageParam;
        this.nomineeAwardQuantityLimit = 0;
        this.nomineeAwardAmountLimit = 0;
    }

    //constructor for Recipient (2)
    public Nominee(String nameParam, String lastNameParam, int ageParam, int awardQuantityLimit, double nomineeAwardAmountLimit) {
        this(nameParam, lastNameParam, ageParam);
        this.nomineeAwardQuantityLimit = awardQuantityLimit;
        this.nomineeAwardAmountLimit = nomineeAwardAmountLimit;
    }

    //method
    public void receiveAward(Award award) {

        System.out.println("Award value: " + award.getValue());

        if (award.getSoli() != null) {

            System.out.println("New award value with soli: " + award.getValue() * award.getSoli() + "\n"
                    + "soli = " + award.getSoli() + "\n" + "difference = "
                    + (Math.abs(((award.getValue() - award.getValue() * award.getSoli()) / award.getValue() * 100))) + "%" + "\n");
        } else {
            System.out.println("no soli" + "\n");
        }
    }

    //Getters & Setters
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getNomineeAwardQuantityLimit() {
        return nomineeAwardQuantityLimit;
    }

    public void setNomineeAwardQuantityLimit(int nomineeAwardQuantityLimit) {
        this.nomineeAwardQuantityLimit = nomineeAwardQuantityLimit;
    }

    public double getNomineeAwardAmountLimit() {
        return nomineeAwardAmountLimit;
    }

    public void setNomineeAwardAmountLimit(double nomineeAwardAmountLimit) {
        this.nomineeAwardAmountLimit = nomineeAwardAmountLimit;
    }


}


