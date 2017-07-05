package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int passcode = 312;
        String coffeeType;

        switch(passcode)    {
            case 555: coffeeType = "Espresso";
            break;

            case 312: coffeeType = "Vanilla latte";
            break;

            case 629: coffeeType = "Drip coffee";
            break;

            default:  coffeeType = "Unknown";
            break;
        }
        System.out.println(coffeeType);
    }
}
