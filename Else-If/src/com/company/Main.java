package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean isLightGreen = true;
        boolean isLightYellow = false;

        if (isLightGreen)   {
            //traffic light is green
            System.out.println("Drive!");
        }
        else if(isLightYellow)  {
            //traffic light is yellow
            System.out.println("Slow Down!");
        }
        else    {
            //traffic light is red
            System.out.println("STOP!");
        }


    }
}
