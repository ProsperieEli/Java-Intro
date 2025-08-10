
public class ToStringOverriding {
    // Last lesson we learned what the Override functionality was. Now, we're going
    // to go over another type of Overriding.

    /*
     * We know that when you create an Object, it is stored as a reference data
     * type. To get information from that, we use things like .name, .quantity, etc.
     * But, what if we wanted to get detailed information by just calling the name
     * of the object? This is what the .toString Override does.
     */

    public static void main(String[] args) {

        ToStringExample example = new ToStringExample("Benjy", "New York", 30, 2025);

        System.out.print(example.toString());
    }
}
