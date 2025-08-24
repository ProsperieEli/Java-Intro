
public class GenericsProduct<T, U> {
    T itemName;
    U price;

    GenericsProduct(T itemName, U price) {
        this.itemName = itemName;
        this.price = price;
    }

    public T getItemName() {
        return this.itemName;
    }

    public U getPrice() {
        return this.price;
    }
}
