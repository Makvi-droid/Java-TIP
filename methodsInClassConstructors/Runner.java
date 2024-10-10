import javax.swing.JOptionPane;

public class Runner {
    

    /* 
     * Lastname, Firstname
     * Course and Section
     * Date
     * Topic
     */
    
     public static void main(String[] args) {

        // Gather inputs for Book
        int bookId = Integer.parseInt(JOptionPane.showInputDialog("Enter Book ID:"));
        String title = JOptionPane.showInputDialog("Enter Book Title:");
        String ISBN = JOptionPane.showInputDialog("Enter Book ISBN:");
        String category = JOptionPane.showInputDialog("Enter Book Category:");

        // Create Book object
        Book book = new Book(bookId, title, ISBN, category);

        // Display Book details
        JOptionPane.showMessageDialog(null, "Book Details: \nBook ID: " + book.getBookId() +
                "\nTitle: " + book.getTitle() + "\nISBN: " + book.getISBN() + "\nCategory: " + book.getCategory());

        // Gather inputs for Author
        int authorId = Integer.parseInt(JOptionPane.showInputDialog("Enter Author ID:"));
        String lastName = JOptionPane.showInputDialog("Enter Author Last Name:");
        String firstName = JOptionPane.showInputDialog("Enter Author First Name:");

        // Create Author object
        Author author = new Author(authorId, lastName, firstName);

        // Display Author details
        JOptionPane.showMessageDialog(null, "Author Details: \nAuthor ID: " + author.getAuthorId() +
                "\nLast Name: " + author.getLastName() + "\nFirst Name: " + author.getFirstName());
    }



}
