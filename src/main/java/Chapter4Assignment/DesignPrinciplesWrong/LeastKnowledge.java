package Chapter4Assignment.DesignPrinciplesWrong;

public class LeastKnowledge {

    /*
    For an operation O on a class C, only operations on the
    following objects should be called:itself, its parameter

    Objects should only have access to operations which it called itself.
    it should not reference values from another class.
     */

    //inner class for readability
    static class Calculator{

        public double add(double a, double b){
            return a + b;
        }

        public double round(double value){

            return Math.round(value);

        }

    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double num = calculator.round(calculator.add(2.5, 6.2));

        System.out.println(num);

    }



}
