package inheritance;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");


        Restaurant burgerMaker = new Restaurant("Burger maker", 40, 7);
        Review demo = new Review("great","mohammad",2);

        System.out.println(burgerMaker.toString());
        System.out.println(demo.toString());




    }


}
