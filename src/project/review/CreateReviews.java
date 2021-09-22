package project.review;


import java.util.Scanner;

public class CreateReviews {


    public void createReview() {
        int CreatedID = 3;
        //just making an ID for the program to run. Feature 2.1 Should make the ID.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the ID of the item you wish to review");
        int ID = scanner.nextInt();

        if (ID == CreatedID) {
            System.out.println("Please give a score from 1-5");

            int Score = scanner.nextInt();

            if (Score > 0 && Score < 6) {
                System.out.println("You have given " + ID + " " + Score + " stars");
                System.out.println("Your item review was registered successfully."
                );

            } else {
                System.out.println("Score must be between 1 and 5");
            }
        } else {

        System.out.println("Item "+ ID + " was not registered yet");

        }
    }
}