package com.epam.lecture1;

public class Task2 {

    public static void main(String args[]) {
        char[] globoArray = {'G', 'l', 'o', 'b', 'o', 'f', 'o', 'r', 'c', 'e'};

        String globoString = new String(globoArray);
        System.out.println(globoString);
        //task 3a

        System.out.println("Size of the globoArray is: " + globoArray.length);
        //task 3b

        for (int i = 0; i < globoArray.length; i++) {
            if (globoArray[i] == 'b') {
                globoArray[i] = '$';
            }
        }

        globoString = new String(globoArray);
        System.out.println(globoString);
        //task 3c_updated

    }


}