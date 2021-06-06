package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution 16
 *  Copyright 2021 Ivedent Lloyd III
 */


import java.util.Scanner;

public class Solution {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        int legalAge = legalAge();

       String outputMessage = ( legalAge < 16) ? "You are not old enough to legally drive." : "You are old enough to legally drive.";
       System.out.println(outputMessage);

    }

    private static int legalAge() {

        System.out.print("What is your age? ");
        String retireInput = in.nextLine();
        int legalAge = Integer.parseInt(retireInput);
        return legalAge;

    }
}
