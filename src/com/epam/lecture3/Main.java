package com.epam.lecture3;

import com.epam.lecture3.award.Award;
import com.epam.lecture3.nominator.Nominator;
import com.epam.lecture3.nominee.Nominee;

public class Main {

    public static void main(String[] args) {
        Award award1 = new Award("Title_1", 1000, 1.0);
        Award award2 = new Award("Title_2", 2000, 2.0);
        Award award3 = new Award("Title_3", 3000, 3.0);

        Award award4 = new Award("Title_4", 4000, 0.5);
        Award award5 = new Award("Title_5", 5000, 0.2);

        //System.out.println("Award value: " + award1.getValue());

        Nominee nominee1 = new Nominee("Igor", "Ivanov", 31);
        Nominee nominee2 = new Nominee("Fedor", "Ivanov", 32);
        Nominee nominee3 = new Nominee("Vasya", "Ivanov", 33);

        //System.out.println("Recipient value: " + nominee1.getName());

        Nominator nominator1 = new Nominator("Olga", "Petrova", 21);
        Nominator nominator2 = new Nominator("Tanya", "Petrova", 22);
        Nominator nominator3 = new Nominator("Marina", "Petrova", 23);

        //System.out.println("Nominator value: " + nominator.getName());

        nominator1.nominate(nominee1, award1);
        nominator2.nominate(nominee2, award2);
        nominator3.nominate(nominee3, award3);

        nominator1.nominate(nominee1, award4);
        nominator2.nominate(nominee2, award5);


    }


}

