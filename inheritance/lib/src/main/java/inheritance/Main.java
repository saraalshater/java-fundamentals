package inheritance;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello Java");


        Restaurant rest = new Restaurant("Burger maker", 30, 5);

        Review review = new Review("Very Good", "sara", 4);
        rest.addReview(review);

        Review review1 = new Review("great","mohammad",4);
        rest.addReview(review1);


        Review review2 = new Review("ok","sara",4);
        rest.addReview(review2);


        Review review3 = new Review("Not Delicious","leen",2);
        rest.addReview(review3);



        Shop shop = new Shop("adidas", "sport", 20);



        Theater theater = new Theater("Uni theater");

//        System.out.println(rest.toString());
//        System.out.println(review1.toString());
//        System.out.println(review2.toString());
        System.out.println(shop);
        System.out.println(shop.getReviews());
        System.out.println(shop);
        System.out.println(rest);
        System.out.println(rest.getReviews());



    }


}
