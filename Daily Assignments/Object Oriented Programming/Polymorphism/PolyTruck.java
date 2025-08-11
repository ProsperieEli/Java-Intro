
public class PolyTruck implements PolyVehicle {

    boolean hasOnlyTwoDoor;

    PolyTruck(boolean hasOnlyTwoDoor) {
        this.hasOnlyTwoDoor = hasOnlyTwoDoor;
    }

    @Override
    public void twoDoor() {
        if (hasOnlyTwoDoor) {
            System.out.println("Yes, this is a two door vehicle.");
        } else {
            System.out.println("This is a four door vehicle.");
        }
    }
}
