package com.epam.lecture3;

public class Person {
    //private:
    private String name;
    private String lastName;
    private int age;

    // protected:
    protected int awardQuantityLimit;
    protected double awardAmountLimit;

    //constructor for Person (1):
    public Person(String nameParam, String lastNameParam, int ageParam) {
        this.name = nameParam;
        this.lastName = lastNameParam;
        this.age = ageParam;
        this.awardQuantityLimit = 2;
        this.awardAmountLimit = 1;
        System.out.println("Person constructor 1");
    }

    //constructor for Person (2):
    public Person(String nameParam, String lastNameParam, int ageParam, int awardQuantityLimit, double nomineeAwardAmountLimit) {
        this(nameParam, lastNameParam, ageParam);
        System.out.println("Person constructor 2");

    }

    //Getters & Setters:

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getAwardQuantityLimit() {
        System.out.println("Person getAwardQuantityLimit: " + awardQuantityLimit);
        return awardQuantityLimit;
    }

    public double getAwardAmountLimit() {
        System.out.println("Person getAwardAmountLimit: " + awardAmountLimit);
        return awardAmountLimit;
    }


}