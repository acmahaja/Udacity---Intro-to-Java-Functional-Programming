package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Define a function playMusic() below.
        // This should print out: "Music is playing" when playButton is true
        // and "Music is paused" when playButton is false.

        boolean playButton = false; // true or false

        playMusic(playButton); // Call the method below and send it the playButton boolean
    }

    // Accepts an existing boolean named playButton, and now you can use it in this method
    public static void playMusic(boolean playButton) {
        if (playButton) {
            System.out.println("Music is playing");
        } else {
            System.out.println("Music is paused");
        }
    }

}

//  Code corrected by J.Myers