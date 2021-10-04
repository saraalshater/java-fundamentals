package inheritance;

import java.util.LinkedList;

public class Shop {
    private String name;
    private String description;
    private int price;


    public Shop(String name, String description,int price ){
        this.name= name;
        this.description= description;

    }


    public String shopPriceCategory(int price) {
        if (price <= 10) {
            return "$";
        } else if (price < 10 || price <= 25) {
            return "$$";
        } if (price < 25 || price <= 50) {
            return "$$$";
        } else {
            return "$$$$";
        }
    }


    private LinkedList<Review> shopReviews = new LinkedList<>();

    public LinkedList<Review> getReviews() {
        return shopReviews;
    }

    public void addReview(Review review) {
        this.shopReviews.add(review);

    }


    public String toString(){
        return "Shop name: "+ name + ", Description " + description +", Price category: " + shopPriceCategory(price) ;
    }


}
