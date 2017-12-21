package com.epam.lecture1;

public class Task1 {

    public static void main (String args []) {
        String str1 = "We make work HUMAN.";
        String str2 = "Unlock full potential. Celebrate positive moments.";
        String str3 = "Every day.";
        //task 2a

        System.out.println (str1 + "\n");
        System.out.println (str2 );
        System.out.println (str3);
        System.out.println();

        System.out.print("2nd string lenght is: " );
        System.out.println(str2.length());
        //task 2b

        System.out.print("\n");
        System.out.print ("2nd string in lower case looks like: " + str2.toLowerCase());
        //task 2c

        System.out.print("\n");
        System.out.print(str2.replace('e', 'E'));
        //task 2d

    }
}
