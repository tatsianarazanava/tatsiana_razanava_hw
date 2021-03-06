package com.epam.lecture3;

import com.epam.lecture3.award.Award;
import com.epam.lecture3.nomination_helper.NominationHelper;
import com.epam.lecture3.nominator.Nominator;
import com.epam.lecture3.nominee.Nominee;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        lecture9();

    }

    private static void lecture3() {
        //awards:
        Award award1 = new Award("Title_1s", 1000, 0.5);
        Award award2 = new Award("Title_2", 2000);
        Award award21 = new Award("Title_21", 2000);

        Award award3 = new Award("Title_3s", 3000, 3.0);
        Award award4 = new Award("Title_4", 4000);

        Award award5 = new Award("Title_5s", 5000, 1.2);
        Award award6 = new Award("Title_6", 6000);

        //recipients:
        Nominee nominee1 = new Nominee("Igor", "Ivanov", 31);
        Nominee nominee2 = new Nominee("Fedor", "Ivanov", 32);
        Nominee nominee3 = new Nominee("Vasya", "Ivanov", 18);

        //nominators:
        Nominator nominator1 = new Nominator("Olga", "Petrova", 21);
        Nominator nominator2 = new Nominator("Tanya", "Petrova", 22);
        Nominator nominator3 = new Nominator("Marina", "Petrova", 23);

        //nominations:
        NominationHelper.nominate(nominator1, nominee1, award1, NominationHelper.NominateType.Lecture3);
        NominationHelper.nominate(nominator1, nominee1, award2, NominationHelper.NominateType.Lecture3);
        NominationHelper.nominate(nominator2, nominee1, award21, NominationHelper.NominateType.Lecture3);


        //calculate quantity:
        Formula formula1 = new Formula();

        double q1 = 0;
        double q2 = 0;
        double q21 = 0;
        double q3 = 0;
        double q4 = 0;

        if (award1.getSoli() == null) {
            q1 = formula1.calculate(award1);

        }

        if (award2.getSoli() == null) {
            q2 = formula1.calculate(award2);

        }

        if (award3.getSoli() == null) {
            q3 = formula1.calculate(award3);

        }

        if (award4.getSoli() == null) {
            q4 = formula1.calculate(award4);

        }

        //examples with operators:

        //case 1:
        if ((q1 != 0) && (q2 != 0)) {
            if (q1 > q2) {
                System.out.println("q1 and q2 compared: q1 > q2");
            } else {
                System.out.println("q1 and q2 compared: q1 < q2");
            }
        } else {
            System.out.println("q1 and q2 cannot be compared!");
        }

        //case 2:
        if ((q2 != 0) && (q4 != 0)) {
            if (q2 > q4) {
                System.out.println("q2 and q4 compared: q2 > q4");
            } else {
                System.out.println("q2 and q4 compared: q2 < q4");
            }
        } else {
            System.out.println("q2 and q4 cannot be compared!");
        }

        //case 3:
        if ((nominee1.getAge() <= 20) || (nominee2.getAge() <= 20) || (nominee3.getAge() <= 20)) {
            System.out.print("\nOne of the recipients is so young: ");

            if (nominee1.getAge() <= 20) {
                System.out.print(nominee1.getName() + " is only " + nominee1.getAge() + " years old.");
            }
            if (nominee2.getAge() <= 20) {
                System.out.print(nominee2.getName() + " is only " + nominee2.getAge() + " years old.");
            }
            if (nominee3.getAge() <= 20) {
                System.out.print(nominee3.getName() + " is only " + nominee3.getAge() + " years old.");
            }
        } else {
            System.out.println("All recipients are older than 20 years old.");
        }

        //case 4:
        if (award2.getValue() == award21.getValue()) {
            System.out.println("\n\n" + nominee1.getName() + " " + nominee1.getLastName() + " has two awards with the same value.");
        } else {
            System.out.println("\n\n" + nominee1.getName() + " " + nominee1.getLastName() + " got some awards with different values.");
        }
    }

    private static void lecture4() {
        //award:
        Award award75 = new Award("Title_75", 75);
        //nominator:
        Nominator nominator75 = new Nominator("Tanya", "Kozlova", 75, 3, 500);
        //recipient:
        Nominee nominee75 = new Nominee("Mike", "Kozlov", 75, 5, 400);

        //enter task No. you want to run (Task1 - Task5, or Lecture3):
        NominationHelper.NominateType taskNum = NominationHelper.NominateType.Task1;

        NominationHelper.nominate(nominator75, nominee75, award75, taskNum);
    }

    private static void lecture6a() {
        System.out.println("--Task with constructors - nominator:");
        Person nominator = new Nominator("Jack", "Green", 40);
        Person nominator1 = new Nominator("Marina", "Vasilkova", 25, 10, 100);

        System.out.println("\n--Task with constructors - recipient:");
        Person nominee = new Nominee("Alice", "Brown", 33, 15, 300);

        //obsolete
        // Person person = new Person("Valentina", "Dubodelova", 55);

        //@Override example:
        System.out.println("\n--Getters override example--");
        //person
//        person.getAwardQuantityLimit();
//        person.getAwardAmountLimit();
//        System.out.println();

        //nominator1
        nominator1.getAwardQuantityLimit();
        nominator1.getAwardAmountLimit();
        System.out.println();
        //recipient
        nominee.getAwardQuantityLimit();
        nominee.getAwardAmountLimit();

    }

    private static void lecture9() {
        List<Award> awards = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            int type_id = i % 3;
            awards.add(new Award("award_title_" + i, 100 + i, 1.0, "award_type_" + type_id, i));
        }


        // print awards with award_type_0:
        NominationHelper.printAwards(awards, "award_type_0");
        System.out.println();


        // print awa types list
        Set<String> awaTypes = new TreeSet<>();
        for (Award award : awards) {
            awaTypes.add(award.getType());
        }

        System.out.println("List of award's types:");
        for (String type : awaTypes) {
            System.out.println("\t" + type);
        }

    }
}