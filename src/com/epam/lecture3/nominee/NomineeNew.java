package com.epam.lecture3.nominee;

import com.epam.lecture3.Person;
import com.epam.lecture3.award.Award;

//new class for NomineeNew extends class Person:
public class NomineeNew extends Person {

    //constructor for Recipient (1):
    public NomineeNew(String nameParam, String lastNameParam, int ageParam) {
        this(nameParam, lastNameParam, ageParam, 0, 0);
        System.out.println("Nominee constructor 1");
    }

    //constructor for Recipient (2):
    public NomineeNew(String nameParam, String lastNameParam, int ageParam, int awardQuantityLimit, double nomineeAwardAmountLimit) {
        super(nameParam, lastNameParam, ageParam, awardQuantityLimit, nomineeAwardAmountLimit);
        System.out.println("Nominee constructor 2");
    }

    //method:
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

    //Getters & Setters:

    public int getNomineeAwardQuantityLimit() {
        return super.awardQuantityLimit;
    }

    public void setNomineeAwardQuantityLimit(int nomineeAwardQuantityLimit) {
        super.awardQuantityLimit = nomineeAwardQuantityLimit;
    }

    public double getNomineeAwardAmountLimit() {
        return super.awardAmountLimit;
    }

    public void setNomineeAwardAmountLimit(double nomineeAwardAmountLimit) {
        super.awardAmountLimit = nomineeAwardAmountLimit;
    }

    //task with @Override testMethod:
    @Override
    public void testMethod() {
        System.out.println("testMethod in Person has been overwritten by testMethod in Recipient");
    }
}
