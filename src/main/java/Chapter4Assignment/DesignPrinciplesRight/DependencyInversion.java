package Chapter4Assignment.DesignPrinciplesRight;

public class DependencyInversion {


    //dependency inversion principle relies on
    //abstractions not concretion
    //when classes rely on another it is dependent and
    //that doesnt work


    //inner classes for readability
    public abstract class A{

    }

    public interface AInterface {

        void sayHello();

    }

    //this is implementing the interface which is extended form A
    //implementation is up to the sub class
    public class B implements AInterface{

        @Override
        public void sayHello() {
            System.out.println("Hello World");
        }
    }

    public class C implements AInterface{


        @Override
        public void sayHello() {
            System.out.println("Hello");
        }
    }




}
