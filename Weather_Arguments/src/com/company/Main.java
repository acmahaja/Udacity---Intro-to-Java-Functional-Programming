package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        weatherInterpreter(4);
    }

    public static void weatherInterpreter(int temperature)  {
        if (temperature > 30)   {
            System.out.println("It's hot outside!");
        }   else if (temperature < 5)   {
            System.out.println("Brr, considering wearing a jacket");
        }   else {
            System.out.println("Not too hot, not too cold.");
        }
    }
}
