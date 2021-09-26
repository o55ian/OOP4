package project.review;

public class ReviewObject {

    String comment;
    int rating;


    public ReviewObject(String comment, int rating) {

        this.comment = comment;
        this.rating = rating;

        String[] comments = {"comment1","comment2","comment3"};
        int[] ratings = {1,2,3,};

        comments[0] = StoreComment();
        ratings[0] = StoreRating();

    }


    public String StoreComment() {
        return comment;

    }


        public int StoreRating () {
        return rating;

        }


}