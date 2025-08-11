
public class PolyMain {

    /*
     * Let's go over Polymorphism. 
     * 
     * Polymorphism is one of the four pillars of OOP. 
     * Poly means many. Morph means shape. Together they mean many shapes. 
     * In programming, this refers to how Polymorphism can identify objects as other objects under the same superclass. 
     * For example, say you have a Car parent and multiple children under that car. You want to create an array of said cars. You can create an array of the Car parent and 
     * have all the children within that array. Let's create an example below.
     */
    public static void main(String[] args) {
        PolyCar car = new PolyCar(true);
        PolyBike bike = new PolyBike(false);
        PolyTruck truck = new PolyTruck(false);

        PolyVehicle[] vehicles = {car, bike, truck};

        for (PolyVehicle/*class */ vehicle/*enhanced for loop name */ : vehicles /*array name */) {
            vehicle.twoDoor();
        }

        /*
         * let's go through this. PolyVehicle is the Interface class that PolyCar, PolyTruck, and PolyBike are all children of. 
         * twoDoor() is a method within that Interface. We create objects from all three of the children classes, but to pass all of them into one array.
         * We have to create the array with the PolyVehicle parent Interface. Why? Because it is the object that they all have in common. 
         * We can then create an enhanced for loop that loops through the array. Running the twoDoor method within each child.
         */
    }
}
