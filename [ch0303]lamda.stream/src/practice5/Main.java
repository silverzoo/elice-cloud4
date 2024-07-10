package practice5;

import java.util.Arrays;
import java.util.List;

import static practice5.MovieAnalyzer.calculateAverageRating;
import static practice5.MovieAnalyzer.findMoviesWithRatingAbove;

public class Main {
    public static void main(String[] args) {
        // 영화 및 리뷰 데이터 초기화
        Movie movie1 = new Movie("The Matrix", 1999, Arrays.asList(new Review(5, "Awesome!"), new Review(4, "Great!")));
        Movie movie2 = new Movie("Inception", 2010, Arrays.asList(new Review(5, "Mind-blowing!"), new Review(5, "Excellent!")));
        Movie movie3 = new Movie("The Godfather", 1972, Arrays.asList(new Review(3, "Good"), new Review(4, "Nice")));
        List<Movie> movies = Arrays.asList(movie1, movie2, movie3);

        // 평균 평점 계산
        double averageRating = calculateAverageRating(movies);
        System.out.printf("🎯 전체 영화 평점: %.2f\n", averageRating);

        // 특정 평점 이상의 영화 찾기
        int ratingThreshold = 4;
        List<Movie> highRatedMovies = findMoviesWithRatingAbove(movies, ratingThreshold);
        System.out.println("\n📌 " + ratingThreshold + "점 이상의 영화 목록:");
        highRatedMovies.forEach(movie -> System.out.println(movie.getTitle() + " - " + movie.getYear()));
    }
}
