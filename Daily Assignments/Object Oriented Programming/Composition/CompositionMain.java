
public class CompositionMain {

    //We went over Aggregation, now we can look at Composition in Java.
    /*
        Composition is similar to Aggregation. Where Aggregation had a has-a relationship between Objects(meaning one has a relation to another),
        Composition instead has a part-of relationship. Example is where a book object can be accessed and exist without the library object.
        Something like an Engine could not exist without a car. The engine is part-of the car. 
        Let's use an example with both Car and Engine with the Engine having that part-of relationship.
     */
    public static void main(String[] args) {
        CompositionCar car = new CompositionCar("Mustang", "V8", true);

        car.carActive();

        /*
         * Here we can see the benefits of OOP. What would be over 20+ lines of code is reduced to only 2 lines in our main, display file. Meanwhile
         * all the work is being done within CompositionCar and CompositionEngine. Let's go look at both to understand what's happening.
         */
    }
}
