package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String driverFirstName;
        driverFirstName = "Hamish";
        String driverLastName;
        driverLastName = "Blake";

        String driverFullName = driverFirstName + driverLastName;
        System.out.println(driverFullName);

        driverFullName = driverFirstName + " " + driverLastName;
        System.out.println(driverFullName);
    }
}
