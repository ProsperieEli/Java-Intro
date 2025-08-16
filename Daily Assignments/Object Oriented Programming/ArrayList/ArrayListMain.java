
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMain {

    //Today we're going to go through ArrayList.
    /* 
     * An ArrayList is extremely simple in concept. It is an Array that is dynamic. It's length is able to change based on need. 
     */
    public static void main(String[] args) {
        ArrayList<String> mangas = new ArrayList<>();

        mangas.add("Dragon Ball");
        mangas.add("Dragon Ball Z");
        mangas.add("Naruto");
        mangas.add("Bleach");

        System.out.println(mangas);

        //Printing our mangas ArrayList displays all four series. Each added with the .add notation.
        //What if we wanted to remove one? We can use the .remove notation.
        mangas.remove(1);
        System.out.println(mangas);
        //Now our array does not include "Dragon Ball Z".

        //We can also replace an index with another string using .set.
        mangas.set(1, "Dragon Ball Z");
        System.out.println(mangas);
        //Now Naruto has been replaced with Dragon Ball Z.

        //We can also use Collections.sort to order the array alphabetically.
        Collections.sort(mangas);
        System.out.println(mangas);

    }

}
