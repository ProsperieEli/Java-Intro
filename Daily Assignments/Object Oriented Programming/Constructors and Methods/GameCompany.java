public class GameCompany {

    String name;
    String companyEmail;
    int startDate;

    GameCompany(String name) {
        this.name = name;
    }

    GameCompany(String name, String companyEmail) {
        this.name = name;
        this.companyEmail = companyEmail;
    }

    GameCompany(String name, String companyEmail, int startDate) {
        this.name = name;
        this.companyEmail = companyEmail;
        this.startDate = startDate;
    }
    /*
     * Breaking these down. We have three attributes. Name, CompanyEmail, and
     * StartDate. We create three constructors all named GameCompany. But, we pass
     * in different parameters to each. Making each technically their own
     * constructor. When called in OverLoadedConstructors.java, we pass in different
     * arguments to call different constructors.
     */
}
