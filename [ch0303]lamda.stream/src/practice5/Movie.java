package practice5;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private int year;
    private List<Review> reviews = new ArrayList<>();

    public Movie(String title, int year, List<Review> reviews) {
        this.title = title;
        this.year = year;
        this.reviews = reviews;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public List<Review> getReviews() {
        return reviews;
    }
}
