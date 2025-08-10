public class ArrayofObjects {
    /*
     * Array of objects are simple but effective ways of having object information
     * stored.
     */

    public static void main(String[] args) {
        ArrayofObjectsConstructor testArray = new ArrayofObjectsConstructor("Mustang", "Black");
        ArrayofObjectsConstructor testArray2 = new ArrayofObjectsConstructor("Chevy", "Blue");

        ArrayofObjectsConstructor[] testing = { testArray, testArray2 };

        for (int i = 0; i < testing.length; i++) {
            testing[i].arrayTest();
        }
    }
}
