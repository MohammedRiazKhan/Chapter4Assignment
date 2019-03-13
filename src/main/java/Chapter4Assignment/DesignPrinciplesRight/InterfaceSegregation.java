package Chapter4Assignment.DesignPrinciplesRight;

public class InterfaceSegregation {

     /*
    Interface Segregation:
    Many specific interfaces are better than a single, general
    interface == Having one general interface is bad since not all classes
    which implement it will make use of all its functionality

    this is an example of the correct way to use and enforce the principle, by creating two interfaces which their
    specific type of dog can implement to get the desired functionality.
     */


    //inner classes for readability
    interface Dog{
        void bark();
    }

    interface Cat{
        void meow();
    }

    public class GermanShepard implements Dog{
        @Override
        public void bark() {
            System.out.println("Woof");
        }
    }

    public class Siamese implements Cat{
        @Override
        public void meow() {
            System.out.println("Meowww");
        }
    }

}
