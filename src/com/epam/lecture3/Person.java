package com.epam.lecture3;

public abstract class Person implements OperationsWithLimit {
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
        this.awardQuantityLimit = 1;
        this.awardAmountLimit = 50;
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
        System.out.println("Person Award Quantity Limit: " + awardQuantityLimit);
        return awardQuantityLimit;
    }

    public double getAwardAmountLimit() {
        System.out.println("Person Award Amount Limit: " + awardAmountLimit);
        return awardAmountLimit;
    }

    @Override
    public boolean isLimitReached(int currentValue, int limit) {
        return currentValue >= limit;
    }

    // Overload
    public abstract boolean isLimitReached(int currentValue);
}