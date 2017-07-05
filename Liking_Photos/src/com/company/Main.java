package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        likePhoto(5, "I liked the photo", true);
    }
    public static void likePhoto(int currentLikes, String comment, boolean like)    {
        // prints out comment and who is commenting
        System.out.println("Feedback: " + comment);
        if(like)    {
            currentLikes = currentLikes + 1;
        }
        System.out.println("Number of likes: " + currentLikes);
    }
}
