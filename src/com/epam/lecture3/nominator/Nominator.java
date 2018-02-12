package com.epam.lecture3.nominator;

import com.epam.lecture3.Person;

//new class for Nominator extends class Person:
public class Nominator extends Person {

    private String country;

    //constructor for Nominator (1)
    public Nominator(String nameParam, String lastNameParam, int ageParam) {
        this(nameParam, lastNameParam, ageParam, 0, 0);
        System.out.println("Nominator constructor 1");
    }

    //constructor for Nominator (2)
    public Nominator(String nameParam, String lastNameParam, int ageParam, int awardQuantityLimit, double awardAmountLimit) {
        super(nameParam, lastNameParam, ageParam, awardQuantityLimit, awardAmountLimit);
        super.awardAmountLimit = awardAmountLimit;
        super.awardQuantityLimit = awardQuantityLimit;
        System.out.println("Nominator constructor 2");
    }

    //Getters & Setters:

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Override
    public int getAwardQuantityLimit() {
        System.out.println("Nominator getAwardQuantityLimit: " + awardQuantityLimit);
        return awardQuantityLimit;
    }

    @Override
    public double getAwardAmountLimit() {
        System.out.println("Nominator getAwardAmountLimit: " + awardAmountLimit);
        return awardAmountLimit;
    }

}