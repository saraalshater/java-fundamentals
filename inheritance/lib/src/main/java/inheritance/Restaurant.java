package inheritance;

public class Restaurant {
    private String name ;
    private double numberOfStars;
    private int priceCategory ;
    private String dollarSign;


    public Restaurant(String name, int priceCategory, double numberOfStars ) {
    this.name = name;
//    this.numberOfStars = numberOfStars;
//    this.priceCategory;




    if (numberOfStars > 5){
        this.numberOfStars = 5;
    }else if (numberOfStars < 0 ){
        this.numberOfStars = 0;
    } else {
        this.numberOfStars = numberOfStars;
    }

    if (priceCategory <= 10){
        System.out.println("$");
    }else if (priceCategory <= 20){
        System.out.println("$$");
    }else if (priceCategory <= 30){
        System.out.println("$$$");
    }else{
        System.out.println("$$$$");
    }



    }


    public String toString(){
        return "Resturant name: "+ name + ", " + ", Price category: " + priceCategory + "Rate : " + numberOfStars ;
    }



//    public void setName(String name) {
//        this.name = name;
//    }
//
//
//    public void setPriceCategory(int priceCategory) {
//        this.priceCategory = priceCategory;
//    }
//
//    public void setNumberOfStars(double numberOfStars) {
//        this.numberOfStars = numberOfStars;
//    }
//
//
//    public int getPriceCategory() {
//        return priceCategory;
//    }
//
//    public double getNumberOfStars() {
//        return numberOfStars;
//    }
//
//    public String getName() {
//        return name;
//    }


}



