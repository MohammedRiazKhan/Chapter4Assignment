package Chapter4Assignment.DesignPrinciplesRight;

public class SingleResponsibility {


    //wrong way, letting to many things happen in the class
    //the old enough check could be made a class which has the logic.

    public void vote(int age, int id){

        if(oldEnough(age)){
            System.out.println("you voted");
        }
        else {
            System.out.println("too young");
        }

    }


    public boolean oldEnough(int age){

        if(age > 18){
            return true;
        }

        return false;

    }

}
