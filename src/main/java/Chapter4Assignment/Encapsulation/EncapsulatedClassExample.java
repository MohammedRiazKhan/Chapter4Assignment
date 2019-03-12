package Chapter4Assignment.Encapsulation;

public class EncapsulatedClassExample {

    private String name = "Child";
    private int age = 23;

    public EncapsulatedClassExample(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", age=" + age;

    }
}
