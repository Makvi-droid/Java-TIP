import javax.swing.JOptionPane;

public class Catalogue {
    public static void main(String[] args) {
        // Selection using switch and JOptionPane
        String option = JOptionPane.showInputDialog("Enter 1 for Book, 2 for Author, 3 for Borrower:");

        switch (option) {
            case "1":
                // Book Attributes
                String bookTitle = JOptionPane.showInputDialog("Enter the Book Title:");
                String bookAuthor = JOptionPane.showInputDialog("Enter the Book Author:");
                String bookISBN = JOptionPane.showInputDialog("Enter the Book ISBN:");

                // Instantiate Book
                Book book = new Book(bookTitle, bookAuthor, bookISBN);

                // Display Book Info using if-else
                if (book != null) {
                    JOptionPane.showMessageDialog(null, "Book Details:\nTitle: " + book.getTitle() +
                            "\nAuthor: " + book.getAuthor() + "\nISBN: " + book.getISBN());
                }
                break;

            case "2":
                // Author Attributes
                String authorName = JOptionPane.showInputDialog("Enter the Author's Name:");
                String authorNationality = JOptionPane.showInputDialog("Enter the Author's Nationality:");

                // Instantiate Author
                Author author = new Author(authorName, authorNationality);

                // Display Author Info
                if (author != null) {
                    JOptionPane.showMessageDialog(null, "Author Details:\nName: " + author.getName() +
                            "\nNationality: " + author.getNationality());
                }
                break;

            case "3":
                // Borrower Attributes
                String borrowerName = JOptionPane.showInputDialog("Enter the Borrower's Name:");
                String borrowerID = JOptionPane.showInputDialog("Enter the Borrower's ID:");

                // Instantiate Borrower
                Borrower borrower = new Borrower(borrowerName, borrowerID);

                // Display Borrower Info
                if (borrower != null) {
                    JOptionPane.showMessageDialog(null, "Borrower Details:\nName: " + borrower.getName() +
                            "\nID: " + borrower.getID());
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Invalid selection. Please choose 1, 2, or 3.");
                break;
        }
    }
}
