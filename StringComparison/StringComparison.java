import javax.swing.JOptionPane;

public class StringComparison {
    public static void main(String[] args) {
        // Accept the first string input from the user.
        String firstString = JOptionPane.showInputDialog("Please enter First String:");
        
        // Accept the second string input from the user.
        String secondString = JOptionPane.showInputDialog("Please enter Second String:");
        
        // Compare the two strings for equality, considering case.
        boolean equalsCaseSensitive = firstString.equals(secondString);
        
        // Compare the two strings for equality, ignoring case.
        boolean equalsIgnoreCase = firstString.equalsIgnoreCase(secondString);
        
        // Display the result of case-sensitive comparison.
        JOptionPane.showMessageDialog(null, "\"" + firstString + "\" equals \"" + secondString + "\" (case-sensitive)? " + equalsCaseSensitive);
        
        // Display the result of case-insensitive comparison.
        JOptionPane.showMessageDialog(null, "\"" + firstString + "\" equals \"" + secondString + "\" (ignore case)? " + equalsIgnoreCase);
    }
}
