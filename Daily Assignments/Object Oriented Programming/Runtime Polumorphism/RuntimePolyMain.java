
import java.util.Scanner;

public class RuntimePolyMain {

    //Yesterday we went over Polymorphism and one Object can store multiple objects under it. For example bikes, cars, and trucks can all be stored as a Vehicle Object.
    //Today, we're going to go over Runtime Polymorphism.
    /*
     * Runtime Polymorphism is sometimes also known as Dynamic Polymorphism. This is because it's whenever a method is decided at runtime. 
     * To show what this means, let's create a poly animal class and two children.
     */
    public static void main(String[] args) {
        RuntimeAnimal animal;

        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.print("Would you like a dog or a cat to talk with? Press 1 for dog, 2 for cat: ");
        choice = scanner.nextInt();

        if (choice == 1) {
            animal = new RuntimeDog();
            animal.animalSpeaks();
        } else {
            animal = new RuntimeCat();
            animal.animalSpeaks();
        }
        scanner.close();
    }

    /*
     * So this is Runtime Polymorphism. We create an object of RuntimeAnimal but do not instantiate it. So, when we run our logic for our choice.
     * We can then declare the created Object to be dynamically assigned to the correct Object based on user input.
     */
}
