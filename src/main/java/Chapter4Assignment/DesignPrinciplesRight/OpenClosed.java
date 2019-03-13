package Chapter4Assignment.DesignPrinciplesRight;

public class OpenClosed {

    //the open/closed is a design principle which states that
    //classes/modules etc should be open to extension not modification.
    //in plain terms, whenever a class needs extra functionality to meet changing requirements
    //create and interface or abstract class which can be implemented/extended
    //to allow more functionality

    //below is the wrong way to do things.

    //inner class for readability
    class Calculator{

        //added first, needed the ability to add 2 numbers
        public int add(int a, int b){

            return a + b;

        }

        //added later needed the ability to add 3 numbers
        public int add(int a, int b, int c){

            return a + b + c;

        }


    }


}
