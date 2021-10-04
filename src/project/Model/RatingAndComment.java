package project.Model;

public class RatingAndComment {

    int rating;
    String comment;

    public RatingAndComment(int rating, String comment){

        this.rating = rating;
        this.comment = comment;
    }
    public RatingAndComment(int rating){
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }
}
