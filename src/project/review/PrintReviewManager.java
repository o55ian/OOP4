package project.review;


import project.Model.Items;
import project.Model.Model;
import project.Model.RatingAndComment;
import project.Utilities;

import java.util.UUID;

public class PrintReviewManager {
    public PrintReviewManager() {
    }

    public void printReview(Model model) {

        System.out.println("Please enter the ID of the review");
        String inputID = Utilities.stringInput();
        System.out.println("Please enter the index of the review");
        int index = Utilities.intInput()-1;

        UUID uuid = UUID.fromString(inputID);
        Items item = model.getItemByID(uuid);
        RatingAndComment ratingAndComment = item.getReview(index);

        System.out.println("Rating: " + ratingAndComment.getRating() + "\nComment: " + ratingAndComment.getComment());
    }
}
