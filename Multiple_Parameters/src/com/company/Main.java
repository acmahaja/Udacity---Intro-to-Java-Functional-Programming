package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printPhoto(30, 40, true);
    }

    public static void printPhoto(int width, int height, boolean inColor){
        System.out.println("Width " + width + " cm");
        System.out.println("Height" + height + " cm");
        if(inColor) {
            System.out.println("Print in full color.");
        }   else {
            System.out.println("Print is black and white.");
        }
    }
}
