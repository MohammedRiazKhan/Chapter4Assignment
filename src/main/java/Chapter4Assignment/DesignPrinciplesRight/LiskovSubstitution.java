package Chapter4Assignment.DesignPrinciplesRight;

import java.util.ArrayList;
import java.util.List;

public class LiskovSubstitution {

    /*
    Good example which enforces the principle.
     */

    //inner classes for readability
    static class Bird {
        public void fly () {
            System.out.println("Birds Fly");
        }
        public void eat () {}
        public void walk(){}
    }

    static class Dove extends Bird {

        @Override
        public void fly() {
            System.out.println("Doves Fly");
        }


    }

    static class Ostrich extends Bird implements FlightlessBird{

        @Override
        public void fly() {
            System.out.println("Ostriches Walks");
        }
    }

    interface FlightlessBird{

        void walk();

    }



    public static void main(String[] args) {
        List<Bird> birdList = new ArrayList<Bird>();

        birdList.add(new Bird());
        birdList.add(new Dove());
        birdList.add(new Ostrich());
        birdList.add(new Dove());

        for(Bird b: birdList){
            b.fly();
        }

    }


}
