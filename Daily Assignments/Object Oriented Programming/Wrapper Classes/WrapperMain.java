
public class WrapperMain {

    /*
    Wrapper classes allow us to wrap primitive values such as int, char, double, and boolean so that they may be used as objects. 
    This is helpful because it allows us access to use these objects with specific static utility methods.
     */
    public static void main(String[] args) {

        //This is called autoboxing. Extremely similar to when you would just do String name = "Ben".
        //Now that these data types are wrapped, we can manipulate them with static utility methods. 
        Integer a = 123;
        Double b = 3.14;
        Boolean c = true;
        Character d = 'A';

        //Say we wanted to convert each to a string. We can use the .toString() method.
        String e = Integer.toString(a);
        System.out.println(e);

        //Now our 123 Integer is a String of 123.
        //Another utility method is the parsing method. Parsing takes a string and reverts it back to it's primative datatype.
        int f = Integer.parseInt(e);
        System.out.println(f + "integer");

    }
}
