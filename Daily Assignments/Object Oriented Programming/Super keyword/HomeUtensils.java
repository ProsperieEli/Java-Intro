
public class HomeUtensils extends WorkUtensils {
    /*
     * Here, HomeUtensils.java is a child of WorkUtensils. It inherits the
     * ObjectName and quantity attributes from the WorkUtensils class. However, due
     * to those two attributes being passed as arguments into the WorkUtensils
     * constructor. They cannot be passed natively into the HomeUtensils
     * constructor. This is what the super keyword is for. A good way to think is to
     * just view it as:
     * super(objectName, quantity) = WorkUtensils(objectName, quantity)
     */

    int price;

    HomeUtensils(String objectName, int quantity, int price) {
        super(objectName, quantity);
        this.price = price;
    }
}
