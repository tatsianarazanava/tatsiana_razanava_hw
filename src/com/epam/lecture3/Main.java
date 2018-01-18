package com.epam.lecture3;

import com.epam.lecture3.award.Award;
import com.epam.lecture3.nominator.Nominator;
import com.epam.lecture3.nominee.Nominee;

public class Main {

    public static void main(String[] args) {
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
        nominator1.nominate(nominee1, award1);
        nominator1.nominate(nominee1, award2);
        nominator2.nominate(nominee1, award21);

        nominator2.nominate(nominee2, award3);
        nominator2.nominate(nominee2, award4);

        nominator3.nominate(nominee3, award5);
        nominator3.nominate(nominee3, award6);

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


        //tasks for lecture4

        //award:
        Award award75 = new Award("Title_75", 75);
        //nominator:
        Nominator nominator75 = new Nominator("Tanya", "Kozlova", 75, 3, 500);
        //recipient:
        Nominee nominee75 = new Nominee("Mike", "Kozlov", 75, 5, 400);

        //enter task No. you want to run:
        int task_number = 5;

        switch (task_number) {

            case 1:
                // task 3.1
                int quantitySum1 = 0;
                int amountSum1 = 0;
                while (quantitySum1 < nominator75.getNominatorAwardQuantityLimit()) {
                    quantitySum1 += 1;
                    amountSum1 = amountSum1 + award75.getValue();
                }
                System.out.println("\nNominator " + nominator75.getName() + ". Task with 'nominatorAwardQuantityLimit'. The maximum is reached: " + quantitySum1 + " awards given.");
                System.out.println("Total amount = " + amountSum1 + " parrots.");
                break;

            case 2:
                // task 3.2
                int quantitySum2 = 0;
                int amountSum2 = 0;
                do {
                    int newValue = amountSum2 + award75.getValue();
                    if (newValue > nominator75.getNominatorAwardAmountLimit()) {
                        break;
                    }
                    amountSum2 = newValue;
                    quantitySum2 = ++quantitySum2;
                } while (true);

                System.out.println("\nNominator " + nominator75.getName() + ". Task with 'nominatorAwardAmountLimit'. The maximum is reached: " + amountSum2 + " parrots given.");
                System.out.println("Total quantity = " + quantitySum2 + " awards.");
                break;

            case 3:
                // task 3.3
                int quantitySum3 = 0;
                int amountSum3 = 0;
                for (; ; ) {
                    int newValue = quantitySum3 + 1;
                    if (newValue > nominee75.getNomineeAwardQuantityLimit()) {
                        break;
                    }
                    quantitySum3 = newValue;
                    amountSum3 = amountSum3 + award75.getValue();
                }

                System.out.println("\nRecipient " + nominee75.getName() + ". Task with 'nomineeAwardQuantityLimit'. The maximum is reached: " + quantitySum3 + " awards received.");
                System.out.println("Total amount = " + amountSum3 + " parrots.");
                break;

            case 4:
                // task 3.4
                int quantitySum4 = 0;
                int amountSum4 = 0;
                for (int i = 1; i < 9999; i++) {
                    int newValue = award75.getValue();
                    newValue *= i;

                    if (newValue > nominee75.getNomineeAwardAmountLimit()) {
                        break;
                    }
                    amountSum4 = newValue;
                    quantitySum4 = ++quantitySum4;
                }

                System.out.println("\nRecipient " + nominee75.getName() + ". Task with 'nomineeAwardAmountLimit'. The maximum is reached: " + amountSum4 + " parrots received.");
                System.out.println("Total quantity = " + quantitySum4 + " awards.");
                break;

            case 5:
                // task 5 = 3.3 additional ('for' without break)
                int quantitySum5 = 0;
                int amountSum5 = 0;
                int li = nominee75.getNomineeAwardQuantityLimit();
                for (quantitySum5 = 0; quantitySum5 < li; quantitySum5++) {

                    amountSum5 = amountSum5 + award75.getValue();
                }

                System.out.println("\nRecipient " + nominee75.getName() + ". Task with 'nomineeAwardQuantityLimit'. The maximum is reached: " + quantitySum5 + " awards received.");
                System.out.println("Total amount = " + amountSum5 + " parrots.");
                break;

            default:
                System.out.println("\nThere is no task with #" + task_number + ". Enter 1, 2, 3, 4 or 5 only.");
                break;
        }

    }
}





