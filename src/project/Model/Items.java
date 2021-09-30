package project.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Items {
    private UUID mID;
    private String mName;
    private Double mPrice;
   // private RatingAndComment ratingsAndComments[] = new RatingAndComment[100];
    ArrayList<RatingAndComment> ratingsAndComments = new ArrayList<RatingAndComment>();

    public Items(String name, Double price) {
        mID = UUID.randomUUID();
        mName = name;
        mPrice = price;
    }

    public UUID getID() { return mID; }

    public String getName() { return mName; }

   public void addReview(RatingAndComment ratingAndComment){




       }





   }



