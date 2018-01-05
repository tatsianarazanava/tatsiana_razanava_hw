package com.epam.lecture3;

import com.epam.lecture3.award.Award;
import com.epam.lecture3.nominator.Nominator;
import com.epam.lecture3.nominee.Nominee;

public class Main {

    public static void main(String[] args) {
        //awards:
        Award award1 = new Award("Title_1s", 1000, 0.5);
        Award award2 = new Award("Title_2", 2000);

        Award award3 = new Award("Title_3s", 3000, 3.0);
        Award award4 = new Award("Title_4", 4000);

        Award award5 = new Award("Title_5s", 5000, 1.2);
        Award award6 = new Award("Title_6", 6000);

        //recipients:
        Nominee nominee1 = new Nominee("Igor", "Ivanov", 31);
        Nominee nominee2 = new Nominee("Fedor", "Ivanov", 32);
        Nominee nominee3 = new Nominee("Vasya", "Ivanov", 33);

        //nominators:
        Nominator nominator1 = new Nominator("Olga", "Petrova", 21);
        Nominator nominator2 = new Nominator("Tanya", "Petrova", 22);
        Nominator nominator3 = new Nominator("Marina", "Petrova", 23);

        //nominations:
        nominator1.nominate(nominee1, award1);
        nominator1.nominate(nominee1, award2);

        nominator2.nominate(nominee2, award3);
        nominator2.nominate(nominee2, award4);

        nominator3.nominate(nominee3, award5);
        nominator3.nominate(nominee3, award6);


    }


}

