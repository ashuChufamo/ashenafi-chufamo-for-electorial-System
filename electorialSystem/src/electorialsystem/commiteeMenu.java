package electorialsystem;
import java.util.Scanner;
public class commiteeMenu extends committee { 
    
    Scanner input= new Scanner(System.in);
    public commiteeMenu(String name, String id, int age, String nationalty) {
        super(name, id, age, nationalty);}
   
    public void committeeMenu(){
        OUTER:
        while (true) {
            System.out.println();
            System.out.println("++++++++++++what do you want to do here+++++++++++++");
            System.out.println("         to add candidates      (give 1)");
            System.out.println("         to add voters          (give 2)");
            System.out.println("         create awareness       (give 3)");
            System.out.println("         to give results        (give 4)");
            System.out.println("         to exit                (give 5)");
            
            int firstInput= input.nextInt();
            
            switch (firstInput) {
                case 1:
                    {
                        System.out.println("how many candidate");
                        int counter= input.nextInt();
                        while(counter > 0){
                            System.out.println("give his name");
                            String name= input.next();
                            System.out.println("give his id");
                            String id= input.next();
                            registerCandidate(name,id);
                            counter--;}  
                        break;
                    }
                case 2:
                    {
                        System.out.println("how many voters");
                        int counter= input.nextInt();
                        while(counter > 0){
                            System.out.println("give his name");
                            String name= input.next();
                            System.out.println("give his id");
                            String id= input.next();
                            registerVoters(id,name);
                            counter--;}     
                        break;
                    }
                case 3:
                    System.out.println("give awreness");
                    String description =input.next();
                    this.setAwareness(description);
                    break;
                case 4:
                    commiteeMenu.winner();
                    commiteeMenu.anounceWinner();
                    commiteeMenu.anounceVote();                    
                    getWinnerAnouncement();
                    break;
                case 5:
                    break OUTER;
                default:
                    System.out.println("invalid input");
                    break;}}}}


