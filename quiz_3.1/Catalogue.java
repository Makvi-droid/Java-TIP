import javax.swing.JOptionPane;

/*

    Name: Benauro, Pascual Bernard T.
    Course and Section: ITE 012 / IT12S1
    Date: 10 - 11 - 2024
    Topic: Quiz 3.1 Selection Control Structure

 */

public class Catalogue {
    public static void main(String[] args) {
        
        String option = JOptionPane.showInputDialog("Enter 1 for Book \nEnter 2 for Author \nEnter 3 for Borrower:");

        switch (option) {
            case "1":
               
                String bookTitle = JOptionPane.showInputDialog("Enter the Book Title:");
                String bookAuthor = JOptionPane.showInputDialog("Enter the Book Author:");
                String bookISBN = JOptionPane.showInputDialog("Enter the Book ISBN:");

                
                Book book = new Book(bookTitle, bookAuthor, bookISBN);

                
                if (book != null) {
                    JOptionPane.showMessageDialog(null, "Book Details:\nTitle: " + book.getTitle() +
                            "\nAuthor: " + book.getAuthor() + "\nISBN: " + book.getISBN());
                }
                break;

            case "2":
                
                String authorName = JOptionPane.showInputDialog("Enter the Author's Name:");
                String authorNationality = JOptionPane.showInputDialog("Enter the Author's Nationality:");

                Author author = new Author(authorName, authorNationality);

                if (author != null) {
                    JOptionPane.showMessageDialog(null, "Author Details:\nName: " + author.getName() +
                            "\nNationality: " + author.getNationality());
                }
                break;

            case "3":
                
                String borrowerName = JOptionPane.showInputDialog("Enter the Borrower's Name:");
                String borrowerID = JOptionPane.showInputDialog("Enter the Borrower's ID:");

                Borrower borrower = new Borrower(borrowerName, borrowerID);

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
