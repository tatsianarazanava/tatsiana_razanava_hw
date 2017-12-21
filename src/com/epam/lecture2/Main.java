package com.epam.lecture2;

import com.epam.lecture2.award.Award;
import com.epam.lecture2.nominee.Nominee;
import com.epam.lecture2.nominator.Nominator;

public class Main {

    public static void main(String[] args) {
        Award award1 = new Award("Title_1", 1000, true);
        Award award2 = new Award("Title_2", 2000, true);

        // System.out.println("Award value: " + award1.getValue());

        Nominee nominee1 = new Nominee("Igor", "Ivanov", 25, true);
        Nominee nominee2 = new Nominee("Fedor", "Ivanov", 26, true);

        Nominator nominator = new Nominator("Olga", "Petrova", 20, false);

        nominator.nominate(nominee1, award1);

    }


}