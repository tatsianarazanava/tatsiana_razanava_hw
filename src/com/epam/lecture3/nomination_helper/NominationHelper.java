package com.epam.lecture3.nomination_helper;

import com.epam.lecture3.award.Award;
import com.epam.lecture3.nominator.Nominator;
import com.epam.lecture3.nominee.Nominee;

public class NominationHelper {

    static public void Nominate(Nominator nominator, Nominee nominee, Award award) {

        System.out.println("Nominator name is " + nominator.getName());
        System.out.println("Recipient name is " + nominee.getName());

        nominee.receiveAward(award);
    }

}
