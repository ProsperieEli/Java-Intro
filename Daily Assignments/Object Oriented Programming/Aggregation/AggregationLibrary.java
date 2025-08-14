
public class AggregationLibrary {

    /*
     * This is our Library. We can see that we once again create private attributes since again, it's not needed for a user to make adjustments.
     * However we also pass in our AggregationBook[]. This tells our constructor that it will take in an array of books. This is how the books array
     * enters the library object.
     * 
     * We then create a displayInformation() method that prints out a welcome message and loops through the books array. With each iteration of our enhanced for loop, we call
     * our bookInformation() method from the AggregationBook file.
     */
    private String name;
    private String state;
    private int yearCreated;
    AggregationBook[] books;

    public AggregationLibrary(String name, String state, int yearCreated, AggregationBook[] books) {
        this.name = name;
        this.state = state;
        this.yearCreated = yearCreated;
        this.books = books;
    }

    void displayInformation() {
        System.out.printf(
                "Welcome to the %s library! Founded in %d, this library is based in %s. Contents inside are: \n",
                this.name, this.yearCreated, this.state);
        for (AggregationBook book : books) {
            book.bookInformation();
        }
    }
}
