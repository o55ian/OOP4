package project.review;


import project.Model.Items;
import project.Model.Model;
import project.Model.RatingAndComment;

import java.util.Scanner;
import java.util.UUID;

public class CreateReviews {

    private Model mModel;

    public CreateReviews( Model model) {
        this.mModel = model;
    }

    public void createReview() {



        for (Items item : mModel.mItems.values()) {
            System.out.println(item.getID().toString() + ": " + item.getName());
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the ID of the item you wish to review");
        String id = scanner.nextLine();
        UUID uuid = UUID.fromString(id);
        Items item = mModel.getItemByID(uuid);
//mModel.getItemByID(ID);
        if (item != null) {
            System.out.println("Please give a score from 1-5");

           int score = scanner.nextInt();
            if (score > 0 && score < 6) {
                System.out.println("You have given " + id + " " + score + " stars");
                RatingAndComment ratingAndComment = new RatingAndComment(score);
                item.addReview(ratingAndComment);
                System.out.println("Your item review was registered successfully."
                );

            } else {
                System.out.println("Score must be between 1 and 5");
            }
        } else {

        System.out.println("Item "+ id + " was not registered yet");

        }

    }


}