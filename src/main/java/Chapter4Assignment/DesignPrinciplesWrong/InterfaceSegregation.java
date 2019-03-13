package Chapter4Assignment.DesignPrinciplesWrong;

public class InterfaceSegregation {

    /*
    Interface Segregation:
    Many specific interfaces are better than a single, general
    interface == Having one general interface is bad since not all classes
    which implement it will make use of all its functionality

    for example and Animal could have all the various behaviour of every animal in existence
    To keep things simple i make use of an Animal class which has two abstract methods
    bark and meow (im sure you can guess which animals those are) furthermore, if a dog or a cat
    were to implement those methods they wont make use of both right? unless its a dog-cat hybrid.

    This is an example of the incorrect way to the principle, ive chosen to take the simplest route.
     */


    //inner classes for readability
    interface Animal{
        void bark();
        void meow();
    }

    public class Dog implements Animal{
        @Override
        public void bark() {
            System.out.println("Woof");
        }

        @Override
        public void meow() {

        }
    }

    public class Cat implements Animal{
        @Override
        public void bark() {

        }

        @Override
        public void meow() {
            System.out.println("MEEEOEEOOEWWS");
        }
    }

}
