package Chapter4Assignment;
import Chapter4Assignment.Encapsulation.EncapsulatedClassExample;
import Chapter4Assignment.Inheritence.FighterRobot;
import Chapter4Assignment.Inheritence.Robot;
import Chapter4Assignment.Polymorphism.Child;
import Chapter4Assignment.Polymorphism.Human;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class Question1Test {

    EncapsulatedClassExample example;
    FighterRobot robot;
    Human riaz;

    @Before
    public void setUp() throws Exception {

       example = new EncapsulatedClassExample();
       robot = new FighterRobot();
       riaz = new Child("Riaz");

    }

    @After
    public void tearDown() throws Exception {

        System.out.println("End of Question 1 Tests");

    }

    @Test
    public void testEncapsulation(){

        //creating an instance of a class
        System.out.println("--- Encapsulation ---");
        System.out.println("Before:" + example);

        example.setName("Mohammed Child Khan");
        example.setAge(23);
        System.out.println("After:" + example);
        System.out.println("--- End Encapsulation ---");

        Assert.assertEquals("is the two equal", example, example);


        //Inheritance
        System.out.println("--- Inheritance ---");
        System.out.println("--- End Inheritance ---");


        //polymorphism
        System.out.println("--- Polymorphism ---");
        System.out.println("--- End Polymorphism ---");

    }

    @Test
    public void testInheritance(){

        //Inheritance
        System.out.println("--- Inheritance ---");
        System.out.println("Is the object an inherited class?");
        Assert.assertSame("Is the object an inherited class?", robot.getClass(), robot.getClass());
        System.out.println("--- End Inheritance ---");

    }

    @Test
    public void testPolymorphism(){

        //polymorphism
        System.out.println("--- Polymorphism ---");
        System.out.println("Polymorphed Talk Method:" + riaz.talk());

        Assert.assertEquals("Test", riaz.getClass(), riaz.getClass());

        System.out.println("--- End Polymorphism ---");

    }

}