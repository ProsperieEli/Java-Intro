
public class CompositionCar {

    /*
     * Here we create our CompositionCar object class. Here we once again use the private keyword to lock our model attribute. However,
    since we never call or read that specific keyword outside of this file, we do not need a GETTER.
    We also create an Object within the Object class. This being CompositionEngine. 
    
    We go to our constructor and pass in things as expected. However when we declare our created Object, we pass in the engine argument. This is the 
    attribute "type" we created in our CompositionEngine file. We finally create a method that prints a string and calls our attributes within an printf statement.
    Note that to access our engine type, we have to use our getType() GETTER as the information is private.
     */
    private String model;
    boolean isRunning = true;
    CompositionEngine engine;

    public CompositionCar(String model, String engine, boolean isRunning) {
        this.model = model;
        this.engine = new CompositionEngine(engine);
        this.isRunning = isRunning;
    }

    void carActive() {
        if (isRunning) {
            System.out.printf("Your %s is ready to drive! We just replaced the %s with a brand new version!", this.model, this.engine.getType());
        } else {
            System.out.println("Come back later!");
        }
    }

}
