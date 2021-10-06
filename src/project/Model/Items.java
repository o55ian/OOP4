package project.Model;

import java.util.UUID;

public class Items {
    private UUID mID;
    private String mName;
    private Double mPrice;
    private RatingAndComment ratingsAndComments[] = new RatingAndComment[100];

    public Items(String name, Double price) {
        mID = UUID.randomUUID();
        mName = name;
        mPrice = price;
    }

    public UUID getID() { return mID; }

    public String getName() { return mName; }

    public Double getPrice() { return mPrice; }

   public void addReview(RatingAndComment ratingAndComment){



       for (int i=0; i<ratingsAndComments.length; i++){

           if (ratingsAndComments[i] == null)

           ratingsAndComments[i] = ratingAndComment;
           if (ratingsAndComments[i] != null){
               ratingsAndComments[i] = ratingAndComment;
               break;
           }

           else{}
       }





   }

}

