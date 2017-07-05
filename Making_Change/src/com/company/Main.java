package com.company;

public class Main {

    public static void main(String[] args) {
// Define a function with the name and parameters:
// makeChange(double itemCost, double dollarsProvided)

// Calculate and return the calculated change which should be the
// dollarsProvided minus the itemCost

// Remember to return a value you need 1) a return type and 2) a return statement

        makeChange(3.60, 5.75);
        double returnedChange = makeChange(3.60, 5.75);
        System.out.println(returnedChange);
    }

        public static double makeChange(double itemCost, double dollarsProvided)    {
            double change = dollarsProvided - itemCost;
            return change;
        }


}
