package Chapter4Assignment.Polymorphism;

public class Child extends Human implements Khan {

    String name;
    String surname;

    public Child(String name){

        this.name = name;
        this.surname = surname();

    }

    @Override
    public String talk() {
        return super.talk() + " World";
    }

    @Override
    public String surname() {
        return "Khan";
    }
}
