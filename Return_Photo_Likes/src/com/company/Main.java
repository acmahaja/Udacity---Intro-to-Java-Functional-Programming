package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        likePhoto(5, "I liked the photo", true);
        int returnedlikes = likePhoto(0, "Nice color!", true);
        int totalLikes = likePhoto(returnedLikes, "I like this", true);
    }


    public static void likePhoto(int currentLikes, String comment, boolean like)    {
        // prints out comment and who is commenting
        System.out.println("Feedback: " + comment);
        if(like)    {
            // increase number of likes by 1
            currentLikes = currentLikes + 1;
        }
        // print out current number of likes
        System.out.println("Number of likes: " + currentLikes);
        // return current likes
        return currentLikes;
    }
}
