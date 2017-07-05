package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int ticketPrice = 10;
        int age = 21;
        boolean isStudent = true;

        if (age <= 15)  {
            ticketPrice = ticketPrice - 5 ;
        }   else if(age >= 50)  {
            ticketPrice = ticketPrice - 5;
        }   else if(isStudent)  {
            ticketPrice = ticketPrice - 5;
        }

        System.out.println("$" + ticketPrice);

    }
}
