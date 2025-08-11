
public class InterfaceMain {

    //Today we're going to go over Interfaces.
    /*
     * An interface is similar to Inheritance where a child inherits methods from a parent Interface. However there are also differences. 
     * For one, with Interfaces, one child can have TWO parents--meaning they can inherit from two different interfaces.
     * Another difference is that methods created within Interface classes MUST be completed within the children that inherit it. Let's create a few Interface classes and see.
     */
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Rat rat = new Rat();

        dog.hunter();
        rat.prey();

        cat.hunter();
        cat.prey();

        //Let's go to the files to go through what's happening.
    }
}
