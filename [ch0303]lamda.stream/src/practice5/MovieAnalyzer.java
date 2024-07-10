package practice5;

import java.util.List;
import java.util.stream.Collectors;

public class MovieAnalyzer {

    public static double calculateAverageRating(List<Movie> movies) {

        return movies.stream()
                .flatMap(movie -> movie.getReviews().stream())
                .mapToInt(Review::getRating)
                .average()
                .orElse(0);
    }

    public static List<Movie> findMoviesWithRatingAbove(List<Movie> movies, int rating) {

        return movies.stream()
                .filter(movie -> movie.getReviews().stream()
                        .mapToInt(Review::getRating)
                        .average()
                        .orElse(0) > rating)
                .collect(Collectors.toList());
    }
}
//flatMap 과 mapToInt 는 스트림을 변환하는 데 사용되는 메소드.
//flatMap: 단일스트림으로 합치는 용도. 여러 리뷰를 하나의 스트림으로 결합하기 위해 사용
//mapToInt: 스트림타입을 int형 데이터로 변환하는 용도. 각 리뷰의 평점을 숫자로 변환하기 위해 사용
