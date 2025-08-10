
public class ToStringExample {
    String name;
    String homeTown;
    int age;
    int year;

    ToStringExample(String name, String homeTown, int age, int year) {
        this.name = name;
        this.homeTown = homeTown;
        this.age = age;
        this.year = year;
    }

    @Override
    public String toString() {
        return "His name is" + " " + this.name + ". He is from " + this.homeTown + " and is " + this.age
                + " years old. " + "He comes from the year " + this.year + ".";
    };
}
