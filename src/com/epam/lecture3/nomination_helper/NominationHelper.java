package com.epam.lecture3.nomination_helper;

import com.epam.lecture3.award.Award;
import com.epam.lecture3.nominator.Nominator;
import com.epam.lecture3.nominee.Nominee;
import java.util.List;

public class NominationHelper {

    public enum NominateType { Task1, Task2, Task3, Task4, Task5, Lecture3 }

    public static void nominate(Nominator nominator, Nominee nominee, Award award, NominateType method) {
        switch (method) {
            case Task1:
                nominatorAwardQuantityLimitTask(nominator, nominee, award);
                break;
            case Task2:
                nominatorAwardAmountLimitTask(nominator, nominee, award);
                break;
            case Task3:
                nomineeAwardQuantityLimitTask(nominator, nominee, award);
                break;
            case Task4:
                nomineeAwardAmountLimitTask(nominator, nominee, award);
                break;
            case Task5:
                nomineeAwardQuantityLimitTask2(nominator, nominee, award);
                break;
            case Lecture3:
                doLecture3(nominator, nominee, award);
                break;
            default:
                System.out.println("\nThere is no task with #" + method + ". Enter 1, 2, 3, 4 or 5 only.");
                break;
        }
    }

    private static void nominatorAwardQuantityLimitTask(Nominator nominator, Nominee nominee, Award award) {
        // task 3.1
        int quantitySum1 = 0;
        int amountSum1 = 0;
        while (!nominator.isLimitReached(quantitySum1, nominator.getAwardQuantityLimit())) {
//        while (quantitySum1 < nominator.getAwardQuantityLimit()) {
            quantitySum1 += 1;
            amountSum1 = amountSum1 + award.getValue();
        }

        System.out.println("\nNominator " + nominator.getName() + ". Task with 'nominatorAwardQuantityLimit'. The maximum is reached: " + quantitySum1 + " awards given.");
        System.out.println("Total amount = " + amountSum1 + " parrots.");
    }

    private static void nominatorAwardAmountLimitTask(Nominator nominator, Nominee nominee, Award award) {
        // task 3.2
        int quantitySum2 = 0;
        int amountSum2 = 0;
        do {
            int newValue = amountSum2 + award.getValue();
            if (newValue > nominator.getAwardAmountLimit()) {
                break;
            }
            amountSum2 = newValue;
            quantitySum2 = ++quantitySum2;
        } while (true);

        System.out.println("\nNominator " + nominator.getName() + ". Task with 'nominatorAwardAmountLimit'. The maximum is reached: " + amountSum2 + " parrots given.");
        System.out.println("Total quantity = " + quantitySum2 + " awards.");
    }

    private static void nomineeAwardQuantityLimitTask(Nominator nominator, Nominee nominee, Award award) {
        // task 3.3
        int quantitySum3 = 0;
        int amountSum3 = 0;
        for (; ; ) {
            int newValue = quantitySum3 + 1;
//            if (newValue > nominee.getAwardQuantityLimit()) {
//                break;
//            }
            quantitySum3 = newValue;
            amountSum3 = amountSum3 + award.getValue();
            if (nominee.isLimitReached(newValue, nominee.getAwardQuantityLimit())) {
                break;
            }
        }

        System.out.println("\nRecipient " + nominee.getName() + ". Task with 'nomineeAwardQuantityLimit'. The maximum is reached: " + quantitySum3 + " awards received.");
        System.out.println("Total amount = " + amountSum3 + " parrots.");
    }

    private static void nomineeAwardAmountLimitTask(Nominator nominator, Nominee nominee, Award award) {
        // task 3.4
        int quantitySum4 = 0;
        int amountSum4 = 0;
        for (int i = 1; i < 9999; i++) {
            int newValue = award.getValue();
            newValue *= i;

            if (newValue > nominee.getAwardAmountLimit()) {
                break;
            }
            amountSum4 = newValue;
            quantitySum4 = ++quantitySum4;
        }

        System.out.println("\nRecipient " + nominee.getName() + ". Task with 'nomineeAwardAmountLimit'. The maximum is reached: " + amountSum4 + " parrots received.");
        System.out.println("Total quantity = " + quantitySum4 + " awards.");
    }

    private static void nomineeAwardQuantityLimitTask2(Nominator nominator, Nominee nominee, Award award) {
        // task 5 = 3.3 additional ('for' without break)
        int quantitySum5 = 0;
        int amountSum5 = 0;
        int li = nominee.getAwardQuantityLimit();
        for (   quantitySum5 = 0;
                !nominee.isLimitReached(li);
                quantitySum5++)
        {
//        for (quantitySum5 = 0; quantitySum5 < li; quantitySum5++) {

            amountSum5 = amountSum5 + award.getValue();
        }

        System.out.println("\nRecipient " + nominee.getName() + ". Task with 'nomineeAwardQuantityLimit'. The maximum is reached: " + quantitySum5 + " awards received.");
        System.out.println("Total amount = " + amountSum5 + " parrots.");
    }

    private static void doLecture3(Nominator nominator, Nominee nominee, Award award) {

        System.out.println("Nominator name is " + nominator.getName());
        System.out.println("Recipient name is " + nominee.getName());

        nominee.receiveAward(award);
    }

    public static void printAwards (List<Award> awards, String type) {
        for (Award award : awards) {
            if (award.getType().equals(type)) {
                System.out.println("Award's type = " + type + " for "  + award.getTitle() + " with value "  + award.getValue());
            }
        }
    }

}
