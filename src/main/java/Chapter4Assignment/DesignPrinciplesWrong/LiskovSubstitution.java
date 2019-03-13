package Chapter4Assignment.DesignPrinciplesWrong;

import java.util.ArrayList;
import java.util.List;

public class LiskovSubstitution {

    /*
    if for each object o1 of type S there is an object o2 of type
    T such that for all programs P defined in terms of T, the
    behaviour of P is unchanged when o1 is substituted for o2
    then S is a subtype of T.

    Plain terms, for every super type which a subtype is derived from, the methods/behaviour
    of the super type remains unchanged if you change the subtypes behaviour.

    Simple right?

    lets simplify it even further, lets say we Have birds, they can fly but not all birds fly.
    We have flightless birds which cant implement the flight functionality of a bird.

    Thats clearly a problem, we cant conform non flying birds to be flightful, so we define an
    additional class which will handle the implementation for that type of bird.
     */

    //inner classes for readability
    static class Bird {
        public void fly() {
        }

        public void eat() {
        }
    }

    static class Dove extends Bird {

    }

    static class Ostrich extends Bird {

        @Override
        public void fly() {
            throw new UnsupportedOperationException();
        }
    }


    public static void main(String[] args) {
        List<Bird> birdList = new ArrayList<Bird>();
        birdList.add(new Bird());
        birdList.add(new Dove());
        birdList.add(new Ostrich());

        for (Bird b : birdList) {
            b.fly();
        }


    }


}
