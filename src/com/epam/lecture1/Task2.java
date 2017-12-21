package com.epam.lecture1;

public class Task2 {

    public static void main(String args[]) {


        char[] globoArray = {'G', 'l', 'o', 'b', 'o', 'f', 'o', 'r', 'c', 'e'};
        String globoString = new String(globoArray);
        System.out.print(globoString);
        //task 3a

        //int size = globoArray.length; --for me
        //System.out.print(size); --for me

        System.out.print("\nSize of the globoArray is: " + globoArray.length);
        //task 3b

        System.out.print("\n");
        System.out.print(globoString.replace('b', '$'));
        //task 3c

    }

}