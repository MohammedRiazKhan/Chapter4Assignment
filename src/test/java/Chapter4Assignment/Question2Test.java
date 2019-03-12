package Chapter4Assignment;

import Chapter4Assignment.Inheritence.ButlerRobotImp;
import Chapter4Assignment.Inheritence.FighterRobotImp;
import Chapter4Assignment.Inheritence.IRobot;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Question2Test {


    IRobot rob;
    IRobot bob;

    @Before
    public void setUp() throws Exception {

        rob = new FighterRobotImp();
        bob = new ButlerRobotImp();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void alternateInheritance(){

        System.out.println("Comparing two different objects implementing the same interface");
        Assert.assertNotEquals("Two equal?", rob, bob);

    }

}