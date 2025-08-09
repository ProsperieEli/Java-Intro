
public class TwoDArrays {

    /*
     * Hello! Today we're going to go over 2D arrays. These are an array where each element is another array. It's best to think of this as array's within another array. It's pretty useful for things like storing a matrix of data/grid work.
     */
    public static void main(String[] args) {

        //First, we create our arrays as we normally would.
        String[] playStation = {"PlayStation 3", "PlayStation 4", "PlayStation 5"};
        String[] xBox = {"xBox 360", "xBox Series X", "xBox One"};
        String[] nintendo = {"Nintendo Switch", "Nintendo Switch 2"};

        //then, we create our 2D array using 2 brackets and passing our previously created arrays in as the values.
        String[][] consoles = {playStation, xBox, nintendo};

        //Using an enhanced for loop, we loop through our 2D array's String datatype. 
        //We then run a second loop and this one says that we are looking to print the individual elements within that 2D array. 
        for (String[] systems : consoles) {
            for (String console : systems) {
                System.out.print(console + " ");
            }
            System.out.println();
        }

    }
}
