public class Borrower {
    private String name;
    private String id;

    // Overwritten constructor
    public Borrower(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getID() {
        return id;
    }
}
