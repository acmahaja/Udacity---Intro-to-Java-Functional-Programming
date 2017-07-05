package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Define a function playMusic() below.
        // This should print out: "Music is playing" when playButton is true
        // and "Music is paused" when playButton is false.

        boolean playButton =false; // true or false
        playMusic(playButton);
    }

    public static void playMusic(boolean playButton) {
        if (playButton) {
            System.out.println("Music is playing");
        } else {
            System.out.println("Music is paused");
        }
    }



}