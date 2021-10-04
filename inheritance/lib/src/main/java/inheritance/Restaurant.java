package inheritance;


import java.util.LinkedList;

public class Restaurant {
    private String name ;
    private double numberOfStars;
    private int price ;
//    private String dollarSign;




    public void updateStars() {

        double current = 0;
        for (int i=0; i < getReviews().size(); i++) {
            current += getReviews().get(i).getStars();
        }
        current = current/(getReviews().size());
        current = Math.round(current);
        this.numberOfStars = current;
    }

    public double verifyStars(double numberOfStars){
        int value = 5;
        while (numberOfStars > 5 || numberOfStars < 0){
            System.out.println("Choose a number between 0 to 5");
            return value;
        }
        return numberOfStars;
    }


    public Restaurant(String name, int price, double numberOfStars ) {
    this.name = name;
//    this.numberOfStars = numberOfStars;
    this.price = price;

    }

    public String priceCategory(int price) {
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





    public int getPriceCategory() {
        return price;
    }

    public double getNumberOfStars() {
        return numberOfStars;
    }

    public String getName() {
        return name;
    }

    private LinkedList<Review> reviews = new LinkedList<>();

    public LinkedList<Review> getReviews() {
        return reviews;
    }
    public void addReview(Review review) {
        this.reviews.add(review);
        updateStars();
    }


    public String toString(){
        return "Resturant name: "+ name + ", Price category: " + priceCategory(price) + ", Rate : " + verifyStars(numberOfStars) ;
    }







}



