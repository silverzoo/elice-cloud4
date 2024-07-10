package practice4;

import java.util.ArrayList;
import java.util.List;

import static practice4.BookFinder.findBooksPublishedAfter;
import static practice4.BookFinder.findBooksWithMorePagesThan;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java Basics", "John Doe", 2005, 250));
        books.add(new Book("Advanced Java", "Jane Doe", 2007, 350));
        books.add(new Book("Learning Java Streams", "James Doe", 2015, 150));
        books.add(new Book("Java in Depth", "Judy Doe", 2010, 400));
        books.add(new Book("Effective Java", "Joshua Bloch", 2008, 300));

        System.out.println("📚 2007년 이후 출간된 책 목록");
        List<Book> booksPublishedAfter2007 = findBooksPublishedAfter(books, 2007);
        for (Book book : booksPublishedAfter2007) {
            System.out.println(book.getTitle());
        }

        System.out.println("\n🎯 300 페이지 이상의 책 목록");
        List<Book> booksWithMorePagesThan300 = findBooksWithMorePagesThan(books, 300);
        for (Book book : booksWithMorePagesThan300) {
            System.out.println(book.getTitle());
        }
    }
}
