package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int stops;
        int fare;
        stops = 0;
        fare = 0;
        stops = stops + 1;
        fare = fare + 5;
        stops = stops + 1;
        fare = fare + 3;
        stops = stops + 1;
        fare = fare + 7;
        System.out.println("The bus made $" + fare + " after " + stops + " stops");
    }
}
