public class ArrayofObjectsConstructor {
    String vehicleName;
    String color;

    ArrayofObjectsConstructor(String vehicleName, String color) {
        this.vehicleName = vehicleName;
        this.color = color;
    }

    void arrayTest() {
        System.out.printf("You car is the %s %s\n", color, vehicleName);
    }
}
