public class Book {
    private int bookId;
    private String title;
    private String ISBN;
    private String category;

    // Overwritten constructor that takes all attributes as parameters
    public Book(int bookId, String title, String ISBN, String category) {
        this.bookId = bookId;
        this.title = title;
        this.ISBN = ISBN;
        this.category = category;
    }

    // Getters to access the private attributes
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getCategory() {
        return category;
    }
}
