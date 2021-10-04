package inheritance;

import java.util.LinkedList;

public class Theater {
    private String name;
    private LinkedList<String> moviesName = new LinkedList<>();


    public Theater(String name){
        this.name = name;

    }



    public LinkedList<String> getReviews() {
        return moviesName;
    }

    public void addReview(String movie) {
        this.moviesName.add(movie);

    }

    public void removeReview(String movie){
        this.moviesName.remove(movie);
    }




}
