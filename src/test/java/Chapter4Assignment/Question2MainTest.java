package Chapter4Assignment;

import Chapter4Assignment.Question2.ButlerRobotImp;
import Chapter4Assignment.Question2.IRobot;
import Chapter4Assignment.Question2.FighterRobotImp;
import Chapter4Assignment.Question2.IRobot;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Question2MainTest {


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