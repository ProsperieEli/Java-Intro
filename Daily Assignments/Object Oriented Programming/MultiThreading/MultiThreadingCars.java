
public class MultiThreadingCars implements Runnable {

    /*
     * We create a constructor to pass in for our MultiThreadingCars object. We then use the run method and a for loop to count upwards to 10.
     * Within that loop, we surround our Thread.sleep with a try catch due to it being dangerous code. We then create an exit code of System.exit to end
     * the program once the race has finished.
     */

    private final String carName;

    public MultiThreadingCars(String carName) {
        this.carName = carName;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted in run() method");
            }
            System.out.println(carName + " " + i);
            if (i == 10) {
                System.exit(0);
            }
        }
    }

}
