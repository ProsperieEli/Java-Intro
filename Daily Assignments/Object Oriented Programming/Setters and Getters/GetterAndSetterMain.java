
public class GetterAndSetterMain {
    //In Java, we sometimes want to prevent attributes from being able to be rewritten easily. 
    //One way we can do this is with the use of Setters.

    /*
     * A setter is a special method that makes an attribute writable. While on the opposite side.
     * A Getter is a special method that makes an attribute readable. 
     * Let's create a Fruit class and go over what we mean in practice.
     */
    public static void main(String[] args) {
        GetterandSetterFruit apples = new GetterandSetterFruit("Apples", 5, 10);
        GetterandSetterFruit oranges = new GetterandSetterFruit("Oranges", 10, 8);

        oranges.setPrice(10);
        oranges.setQuantity(8);
        /*
         * Our GETTERS and SETTERS are methods created in our Class file. Because our attributes are private, we can use our GETTERS(getName, getQuantity, and getPrice) to allow other files
         * the option to be able to read these attributes. However, our SETTERS(setPrice and setQuantity) enable us the opportunity to modify pre-existing data.
         * Notice how when the oranges object was created, the quantity was 10 and price was 8? We used our SETTER methods to change this so that the price was 10 and quantity was 8.
         * This can also be used for user input. Say we have a scanner, we can use user input to modify and set an Objects fields.
         */
        System.out.println(apples.getName() + " " + apples.getQuantity() + " " + apples.getPrice());
        System.out.println(oranges.getName() + " " + oranges.getQuantity() + " " + oranges.getPrice());
    }
}
