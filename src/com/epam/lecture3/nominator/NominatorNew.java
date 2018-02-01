package com.epam.lecture3.nominator;

import com.epam.lecture3.Person;

//new class for NominatorNew extends class Person:
public class NominatorNew extends Person {

    private String country;

    //constructor for Nominator (1)
    public NominatorNew(String nameParam, String lastNameParam, int ageParam) {
        this(nameParam, lastNameParam, ageParam, 0, 0);
        System.out.println("Nominator constructor 1");
    }

    //constructor for Nominator (2)
    public NominatorNew(String nameParam, String lastNameParam, int ageParam, int awardQuantityLimit, double nomineeAwardAmountLimit) {
        super(nameParam, lastNameParam, ageParam, awardQuantityLimit, nomineeAwardAmountLimit);
        System.out.println("Nominator constructor 2");
    }

    //Getters & Setters:

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNominatorAwardQuantityLimit() {
        return awardQuantityLimit;
    }

    public void setNominatorAwardQuantityLimit(int nominatorAwardQuantityLimit) {
        this.awardQuantityLimit = nominatorAwardQuantityLimit;
    }

    public double getNominatorAwardAmountLimit() {
        return awardAmountLimit;
    }

    public void setNominatorAwardAmountLimit(double nominatorAwardAmountLimit) {
        this.awardAmountLimit = nominatorAwardAmountLimit;
    }

}
