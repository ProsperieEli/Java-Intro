public class Monkey extends RescueAnimal {

    // The first thing I did with my Monkey file is created my private variables.
    // These are all variables not inherited from the RescueAnimal class and are
    // specific to our Monkey file.
    private String breed;
    private String tailLength;
    private String height;
    private String bodyLength;
    private String species;

    /*
     * Next, I created my constructor. Following the same format as the Dog class
     * did. Initializing my variables within the parameters and adding the five
     * extra attributes that are exclusive to my Monkey class into my constructor to
     * be passed through.
     */
    public Monkey(String name, String gender, String age, String weight, String acquisitionDate,
            String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry, String breed,
            String tailLength, String height, String bodyLength, String species) {
        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setAnimalType("monkey");

        // this files attributes.
        setBreed(breed);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setSpecies(species);

    }

    // Wrapping up this file, I created my getters and setters to allow future data
    // to be both readable and writable.
    public String getBreed() {
        return breed;
    }

    public String getSpecies() {
        return species;
    }

    public String getTailLength() {
        return tailLength;
    }

    public String getHeight() {
        return height;
    }

    public String getBodyLength() {
        return bodyLength;
    }

    // setters
    public void setBreed(String monkeyBreed) {
        breed = monkeyBreed;
    }

    public void setSpecies(String monkeySpecies) {
        species = monkeySpecies;
    }

    public void setTailLength(String monkeyTailLength) {
        tailLength = monkeyTailLength;
    }

    public void setHeight(String monkeyHeight) {
        height = monkeyHeight;
    }

    public void setBodyLength(String monkeyBodyLength) {
        bodyLength = monkeyBodyLength;
    }
}
