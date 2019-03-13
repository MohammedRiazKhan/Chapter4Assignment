package Chapter4Assignment.DesignPrinciplesWrong;

public class DependencyInversion {


    //dependency inversion principle relies on
    //abstractions not concretion
    //when classes rely on another it is dependent and
    //that doesnt work


    //inner classes for readability
    public abstract class A{

        abstract void sayHello();

    }

    //this is extending a and inherits its methods,
    //implementation is up to the sub class
    public class B extends A{

        @Override
        void sayHello() {
            System.out.println("Hello");
        }
    }

    public class C extends A{

        @Override
        void sayHello() {
            System.out.println("Hello World");
        }
    }

}
