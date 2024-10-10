public class Author {
    
    private int authorId;
    private String lastName;
    private String firstName;

    // Overwritten constructor that takes all attributes as parameters
    public Author(int authorId, String lastName, String firstName) {
        this.authorId = authorId;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    // Getters to access the private attributes
    public int getAuthorId() {
        return authorId;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

}
