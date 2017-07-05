package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int passcode = 555;
        String coffeeType;

        if (passcode == 555)    {
            //espresso passcode
            coffeeType = "Espresso";
        }
        else if (passcode ==312)    {
            //vanilla passcode
            coffeeType = "Vanilla latte";
        }
        else if (passcode == 629)   {
            //drip coffee code
            coffeeType = "Drip coffee";
        }
        else    {
            //unknown passcode
            coffeeType = "Unknown";
        }

        System.out.println(coffeeType);
    }
}
