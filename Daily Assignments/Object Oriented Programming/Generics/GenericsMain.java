
public class GenericsMain {

    /*
     * Today we're gonna go over the use of generics in Java. Generics is a concept
     * where you write a class, method, or interface that is compatible with
     * multiple data types. We'll show this in use by creating a class of Products
     * and using generics to customize it's data types.
     */

    public static void main(String[] args) {

        GenericsProduct<String, Integer> product1 = new GenericsProduct<>("Iphone quantity", 4000);
        GenericsProduct<String, Double> product2 = new GenericsProduct<>("Iphone", 999.99);

        System.out.println(product1.getItemName());
        System.out.println(product1.getPrice());

        System.out.println(product2.getItemName());
        System.out.println(product2.getPrice());

    }
}
