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
        this.awardQuantityLimit = 0;
        this.awardAmountLimit = 0;
        System.out.println("Person constructor 1");
    }

    //constructor for Person (2):
    public Person(String nameParam, String lastNameParam, int ageParam, int awardQuantityLimit, double nomineeAwardAmountLimit) {
        this(nameParam, lastNameParam, ageParam);
        this.awardQuantityLimit = awardQuantityLimit;
        this.awardAmountLimit = nomineeAwardAmountLimit;
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

    //task with @Override testMethod:
    public void testMethod() {
        System.out.println("testMethod in Person");
    }

}
