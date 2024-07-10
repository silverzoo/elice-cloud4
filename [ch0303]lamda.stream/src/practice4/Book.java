package practice4;

public class Book {
    private String title;
    private String author;
    private int yearOfPublication;
    private int numberOfPages;

    public Book(String title, String author, int yearOfPublication, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
