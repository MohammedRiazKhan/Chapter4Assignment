package Chapter4Assignment.DesignPrinciplesWrong;

public class OpenClosed {

    //this is the correct way to implement the Open/Closed principle.
    //by creating an interface or abstract class to extend or implement.
    //when new functionality is required that particular class can add the required
    //functionality

    //inner class for readability only
    interface Calculator{

        //added first, needed the ability to add 2 numbers
        int add(int a, int b);
        int add(int a, int b, int c);//this can be implemented anyway

    }

    class CalculatorImp implements Calculator{


        @Override
        public int add(int a, int b) {
            return a + b;
        }

        @Override
        public int add(int a, int b, int c) {
            return a + c + b;
        }


    }


}
