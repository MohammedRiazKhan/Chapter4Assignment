package Chapter4Assignment.DesignPrinciplesWrong;

public class SingleResponsibility {

    VotingService service = new VotingService();

    public void vote(int age, int id){

        if(service.oldEnough(age)){
            System.out.println("Voted successfully");
        }
        else {
            System.out.println("too young");
        }
    }

    //use of inner classes for readability
    class VotingService{

        public boolean oldEnough(int age){

            if(age > 18){
                return true;
            }

            return false;

        }

    }

}
