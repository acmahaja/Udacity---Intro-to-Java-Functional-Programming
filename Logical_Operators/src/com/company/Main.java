package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean isStudent = true;
        int age = 29;
        int ticketPrice = 10;

        if(age <= 16 || age >= 50 || isStudent) {
            ticketPrice = ticketPrice - 5;
        }

        System.out.println("$" + ticketPrice);
    }
}
