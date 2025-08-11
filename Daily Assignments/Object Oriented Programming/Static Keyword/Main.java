public class Main {
    // Let's go over the Static keyword.

    /*
     * the Static keyword is used in Objects to make a variable or class belong to
     * the Object rather than the specific class. Let's go to Friends.java to
     * try.
     */

    public static void main(String[] args) {
        /*
         * It seems like a lot of code so let's go through everything.
         * First, we created our Objects from the Friends.java file. Giving them unique
         * names and passing in the argument of name. Next we created an array of the
         * Friends class to hold all of those Objects. Next we loop through that array
         * and print out the name within each object.
         */
        String firstFamily;

        Friends ben = new Friends("Benjy");
        Friends reed = new Friends("Reed");
        Friends johnny = new Friends("Johnny");
        Friends sue = new Friends("Sue");

        Friends[] FF = { ben, reed, johnny, sue };
        for (int i = 0; i < FF.length; i++) {
            firstFamily = FF[i].name;
            System.out.println(firstFamily);

        }
        /*
         * Finally, we print this Friends.numOfFriends. This is where our static keyword
         * is being used. Because we have 4 created Objects, and are incrimenting our
         * numOfFriends in the Friends constructor. It counts each as an independant
         * Object. Each are counted as their own, unique Object and tallied together.
         * This is what the static keyword is used for.
         */
        System.out.println(Friends.numOfFriends);

    }
}
