package project.Model;

import project.Utilities;

import java.util.ArrayList;
import java.util.UUID;

public class Items {
    private UUID mID;
    private String mName;
    private Double mPrice;
    // private RatingAndComment ratingsAndComments[] = new RatingAndComment[100];
    ArrayList<RatingAndComment> ratingsAndComments = new ArrayList<>();


    public Items(String name, Double price) {
        mID = UUID.randomUUID();
        mName = name;
        mPrice = price;
    }

    public UUID getID() {
        return mID;
    }

    public String getName() {
        return mName;
    }

    public ArrayList<RatingAndComment> getRatingsAndComments() {
        return ratingsAndComments;
    }


    public RatingAndComment getReview(int index) {
        RatingAndComment element = ratingsAndComments.get(index);
        return element;
    }

    public void addReview(RatingAndComment ratingAndComment) {


        ratingsAndComments.add(ratingAndComment);


    }


}



