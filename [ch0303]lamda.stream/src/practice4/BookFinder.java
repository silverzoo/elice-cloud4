package practice4;

import java.util.List;
import java.util.stream.Collectors;


public class BookFinder {

    public static List<Book> findBooksPublishedAfter(List<Book> books, int year) {

        return books.stream()
                    .filter(book -> book.getYearOfPublication() > year)
                    .collect(Collectors.toList());
        //filter(Book::getYearOfPublication() > year)처럼 사용하려고 했으나 오류 왜? -> ::을 사용할 때에는 조건식을 포함할 수 없음

    }

    public static List<Book> findBooksWithMorePagesThan(List<Book> books, int numberOfPages) {

        return books.stream()
                    .filter(book -> book.getNumberOfPages() > numberOfPages)
                    .collect(Collectors.toList());

    }
}
