package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //  This function checks eligibility to ride a roller coaster, and requires that a
        //  person input their height in cm.

        admission(130.5); // is a valid function call
    }

    public static void admission(double height) {

        // checks height reqs
        if (height > 120)   {
            System.out.println("You pass the height requirements");
        }
        else    {
            System.out.println("Sorry, you do not pass.");
        }
    }

}
