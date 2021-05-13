package electorialsystem;
import static electorialsystem.committee.getWinnerAnouncement;
import java.util.Scanner;

public class candidateMenu extends candidate{
    
    Scanner input = new Scanner(System.in);
    committee com;
    
    public candidateMenu(String name, String Id, int age, String nationality, String party,String campaign) {
        super(name, Id, age, nationality, party,campaign);}
    
    public void getAwareness() {
        if(awareness[0].isEmpty()){System.out.println("no awareness yet");}
        else{System.out.println(awareness[0]);}}

    public void candidatesMenu(){
        
        OUTER:
        while (true){
        System.out.println();
        System.out.println("**********what do you want to do here*******");
        System.out.println("       to get result         (give 1)");
        System.out.println("       to get awareness      (give 2)");
        System.out.println("       to exit               (give 3)");
        
        int firstInput= input.nextInt();        
        switch (firstInput) {
            case 1:
                getWinnerAnouncement();
                break;
            case 2:
                getAwareness();
                break;
            case 3:
                break OUTER;
            default:
                System.out.println("invalid input");}}}}
