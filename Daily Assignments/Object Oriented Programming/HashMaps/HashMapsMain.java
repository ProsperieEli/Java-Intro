
import java.util.HashMap;

public class HashMapsMain {

    /* 
     * Today we're going to go over HashMaps. Hashmaps are a popular data structure that stores key-value pairs. 
     * The keys are unique and cannot be repeated, but the values can. And while there is no order, it is memory efficient in use.
     */
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();

        map.put("Galactus Popcorn bucket", 78.99);
        map.put("Legend of Zelda: Collectors Edition", 150.00);
        map.put("Ezreal figurine", 80.00);
        map.put("Coffee", 35.000);

        System.out.println(map);
        //Running this gives us all the key-vales we put into our map. We can use the remove method to take one out. Let's remove coffee.

        map.remove("Coffee");

        System.out.println(map);
        //Now coffee key-value has been removed. Let's say we want to get a specific value. We can use the get method.

        System.out.println(map.get("Ezreal figurine"));
        //the caintainsKey and containsValue are boolean methods that tells us if that specific key/value exist.

        System.out.println(map.containsValue(80.00));
        System.out.println(map.containsKey("Legend of Zelda: Collectors Edition"));
        //map.size will tell us how many key-value pairings exist within our map.

        System.out.println(map.size());

        //Finally, let's create an enhanced for-each loop to iterate through this map.
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        //the keySet method returns all keys in our map.
    }
}
