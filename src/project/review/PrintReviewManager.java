package project.review;


import project.Model.Items;
import project.Model.Model;
import project.Model.RatingAndComment;
import project.Utilities;

import java.util.ArrayList;
import java.util.UUID;

public class PrintReviewManager {
    public PrintReviewManager() {
    }

    public void printReview(Model model) {

        System.out.println("Please enter the ID of the review");
        String inputID = Utilities.stringInput();
        System.out.println("Please enter the index of the review");
        int index = Utilities.intInput() - 1;

        UUID uuid = UUID.fromString(inputID);
        Items item = model.getItemByID(uuid);
        ArrayList theList = item.getRatingsAndComments();



        if (index > theList.size() || index < 0) {
            System.out.println("Invalid review number. Choose between 1 and " + theList.size());
            return;
        }
        if (theList.isEmpty()) {
            System.out.println("Item " + uuid + " was not registered yet.");
            return;
        }

        RatingAndComment ratingAndComment = item.getReview(index);

        if (ratingAndComment.getComment() == null && ratingAndComment.getRating() == 0){
            System.out.println("Item " + item.getName() + " has not been reviewed yet."
            );
             return;
        }

        System.out.println("Rating: " + ratingAndComment.getRating() + "\nComment: " + ratingAndComment.getComment());
    }
}
