/*
 Today we will be going over the Java substring method. This method allows us to cut a portion of a string in two. let's look at it by checking a name string.
 */

public class Substring {
    public static void main(String[] args) {
        
        String name = "Techno Logy";

        String firstName = name.substring(0, 6);
        System.out.println(firstName);

        /*
         We created our string of a name. We then create a new variable that will hold our substring result. Using the substring method on our String variable of name, we pass in
         two arguments: a beginning index and an end index. The beginning index is inclusive, meaning it will be included in our result. The second index is exclusive. It tells us
         where to end our search and will not be included. Let's get the last name.
         */

         String lastName = name.substring(7, 11);
        System.err.println(lastName);

        //Here we see the final parts of the string tagged. Note, that if we wanted, we could specify only the beginning index if we are including the entire remaining half of the string.
        }
}
