
public class CompositionEngine {

    /*
     * Here we create our CompositionEngine Object class. We give it a private String for good practice because a type of engine can't change.
     * Because of this, we also create a getType GETTER that will be used to allow other files to read this private attribute.
     */
    private String type;

    public CompositionEngine(String type) {
        this.type = type;
    }

    String getType() {
        return this.type;
    }

}
