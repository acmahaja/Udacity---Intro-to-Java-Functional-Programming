package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean action = true;
        boolean romance = true;
        boolean comedy = true;
        boolean horror = true;

        if(action && romance)   {
            //includes action and romance
            System.out.println("This movie includes action and romance.");
            if(comedy || horror)    {
                // everyone's preferences have been met!
                System.out.println("This also includes comedy or horror!");
            }
        }
    }
}
