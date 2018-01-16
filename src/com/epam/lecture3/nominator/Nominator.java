package com.epam.lecture3.nominator;

import com.epam.lecture3.award.Award;
import com.epam.lecture3.nominee.Nominee;

public class Nominator {

    private String name;
    private String lastName;
    private int age;
    private int nominatorAwardQuantityLimit;
    private double nominatorAwardAmountLimit;


    //constructor for Nominator (1)
    public Nominator(String nameParam, String lastNameParam, int ageParam) {
        this.name = nameParam;
        this.lastName = lastNameParam;
        this.age = ageParam;
        nominatorAwardQuantityLimit = 0;
        nominatorAwardAmountLimit = 0;
    }

    //constructor for Nominator (2)
    public Nominator(String nameParam, String lastNameParam, int ageParam, int awardQuantityLimit, double awardAmountLimit) {
        this(nameParam, lastNameParam, ageParam);
        nominatorAwardQuantityLimit = awardQuantityLimit;
        nominatorAwardAmountLimit = awardAmountLimit;
    }

    //method
    public void nominate(Nominee nominee, Award award) {
        System.out.println("Recipient name is " + nominee.getName());

        nominee.receiveAward(award);
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

    public int getNominatorAwardQuantityLimit() {
        return nominatorAwardQuantityLimit;
    }

    public void setNominatorAwardQuantityLimit(int nominatorAwardQuantityLimit) {
        this.nominatorAwardQuantityLimit = nominatorAwardQuantityLimit;
    }

    public double getNominatorAwardAmountLimit() {
        return nominatorAwardAmountLimit;
    }

    public void setNominatorAwardAmountLimit(double nominatorAwardAmountLimit) {
        this.nominatorAwardAmountLimit = nominatorAwardAmountLimit;
    }

}