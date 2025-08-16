
public class AggregationMain {

    //Today we go over Aggregation!   
    /*
        Aggregation is a way to express a "has-a" relationship between Objects. Aggregation allows an Object to hold another Object inside. We'll go about showing this
        by creating two Object classes. A library and a book. We will then create an array of book Objects and insert that book Objects into our library Object. 
     */
    public static void main(String[] args) {
        AggregationBook book1 = new AggregationBook("Percy Jackson: The Lightning Thief", 400, "Rick Riordan");
        AggregationBook book2 = new AggregationBook("Gone", 500, "Michael Grant");
        AggregationBook book3 = new AggregationBook("Superman Vol 8", 150, "Dan Slott");

        AggregationBook[] books = {book1, book2, book3};

        AggregationLibrary library = new AggregationLibrary("Seattle Washington Library", "Washington", 1890, books);

        library.displayInformation();

        /*
         * Lot of work here so let's go through it. We created three book objects as normal. We then placed all within an array labeled as books. We then created a new object called 
         * library based from the class Object of Aggregation Library and passed in our books array as one of the arguments. Finally, we call the library Object with a displayInformation()
         * method. This prints all of our book objects within our newly created library object. We can go to AggregatationBook and AggregationLibrary both to explore these files.
         */
    }
}
