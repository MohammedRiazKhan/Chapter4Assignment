package Chapter4Assignment.Inheritence;

public class FighterRobot extends Robot {

    public FighterRobot() {
        super();
    }

    @Override
    public String typeOfRobot(){
        return "Fighter " + typeOfRobot();
    }


}
