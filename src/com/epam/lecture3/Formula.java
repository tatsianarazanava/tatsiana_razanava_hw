package com.epam.lecture3;

import java.util.Random;

import com.epam.lecture3.award.Award;


public class Formula {

    public double calculate(Award award) {

        // formula: quantity = ((zz * P * (1-P)) / cc) / (1 + (( ((z * P * (1-P )) / cc) -1) / population));

        int p = award.getValue();

        int pop = 1;

        double c = Math.random();

        Random generator = new Random();
        int z = generator.nextInt();

        int x = 2;
        double zz = Math.pow(z, x);

        double cc = Math.pow(c, x);

        double q1 = (zz * p * (1 - p)) / cc;

        double q = q1 / (1 + ((((z * p * (1 - p)) / cc) - 1) / pop));

        System.out.println("Quantity for award '" + award.getTitle() + "' ("
                + award.getValue() + "):\n" + q + "\nformula calculated" + "\n");

        return q;


    }


}


