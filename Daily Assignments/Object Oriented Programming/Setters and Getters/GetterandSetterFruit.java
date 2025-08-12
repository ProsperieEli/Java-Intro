
public class GetterandSetterFruit {

    private String name;
    private int quantity;
    private int price;

    public GetterandSetterFruit(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    String getName() {
        return this.name;
    }

    int getQuantity() {
        return this.quantity;
    }

    int getPrice() {
        return this.price;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    void setPrice(int price) {
        this.price = price;
    }

}
