public class Book {
    private final String book;
    private final Author author;
    private int yearOfPublication;

    public Book(String book, Author author, int yearOfPublication){
        this.book = book;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getBook() {
        return book;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
