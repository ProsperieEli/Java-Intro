public class OverLoadedConstructors {
    /*
     * Now that we've gone over basic constructors. Let's quickly touch on an
     * overloaded constructor. An overloaded constructor is when a class has
     * multiple constructors that take in differnt parameters. For this, we'll
     * create a constructor within the GameCompany class.
     */
    public static void main(String[] args) {

        GameCompany sony = new GameCompany("Sony");
        GameCompany microsft = new GameCompany("Microsft", "BillGates@Outlook.com");
        GameCompany amazon = new GameCompany("Amazon", "BestCompany@Gmail.com", 1994);

        System.out.println(sony.name);
        System.out.println(microsft.name);
        System.out.println(microsft.companyEmail);
        System.out.println(amazon.name);
        System.out.println(amazon.companyEmail);
        System.out.println(amazon.startDate);

    }
}
