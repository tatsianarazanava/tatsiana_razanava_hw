package com.epam.lecture3.nominee;

import com.epam.lecture3.Person;
import com.epam.lecture3.award.Award;

//new class for Nominee extends class Person:
public class Nominee extends Person {

    //constructor for Recipient (1):
    public Nominee(String nameParam, String lastNameParam, int ageParam) {
        this(nameParam, lastNameParam, ageParam, 0, 0);
        System.out.println("Nominee constructor 1");
    }

    //constructor for Recipient (2):
    public Nominee(String nameParam, String lastNameParam, int ageParam, int awardQuantityLimit, double awardAmountLimit) {
        super(nameParam, lastNameParam, ageParam, awardQuantityLimit, awardAmountLimit);
        super.awardAmountLimit = awardAmountLimit;
        super.awardQuantityLimit = awardQuantityLimit;
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


    @Override
    public int getAwardQuantityLimit() {
        System.out.println("Recipient getAwardQuantityLimit: " + awardQuantityLimit);
        return super.awardQuantityLimit;
    }

    @Override
    public double getAwardAmountLimit() {
        System.out.println("Recipient getAwardAmountLimit: " + awardAmountLimit);
        return super.awardAmountLimit;
    }

}