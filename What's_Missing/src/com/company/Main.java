package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        admission(121);
        String returnPassText = admission(121);
        System.out.println(admission(returnPassText));
    }

    public static String admission(double height)  {
        String passText;
        // checks height reqs
        if (height > 120)   {
            passText = "You pass the height requirements";
        }
        else    {
            passText = "Sorry, you do not pass.";
        }
        System.out.println(passText);
        return passText;
    }
}
