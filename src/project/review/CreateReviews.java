package project.review;


import project.Model.Items;
import project.Model.Model;
import project.Model.RatingAndComment;
import project.Utilities;

import java.util.Scanner;
import java.util.UUID;

public class CreateReviews {

    private Model mModel;

    public CreateReviews( Model model) {
        this.mModel = model;
    }

    public void createReview() {





        System.out.println("Please enter the ID of the item you wish to review");
        String id = Utilities.stringInput();
        UUID uuid = UUID.fromString(id);
        Items item = mModel.getItemByID(uuid);
//mModel.getItemByID(ID);
        if (item != null) {
            System.out.println("Please give a score from 1-5");

           int score = Utilities.intInput();
            System.out.println("Please add a comment, if you do not want to add a comment, press enter");

           String comment = Utilities.stringInput();
           if (comment.equals("")) {
               comment = null;
           }
            if (score > 0 && score < 6) {
                System.out.println("You have given " + id + " " + score + " stars");
                RatingAndComment ratingAndComment = new RatingAndComment(score, comment);
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