package inheritance;

public class Review {
private String body;
private String author;
private double numberOfStars;


    public Review(String body, String author, double numberOfStars ) {
        this.body = body;
        this.author = author;



        if (numberOfStars > 5){
            this.numberOfStars = 5;
        }else if (numberOfStars < 0 ){
            this.numberOfStars = 0;
        } else {
            this.numberOfStars = numberOfStars;
        }
    }







    public String toString(){
        return body + " " + numberOfStars + " " + author;
    }



}
