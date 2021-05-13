package electorialsystem;
import static electorialsystem.committee.getWinnerAnouncement;
import java.util.Scanner;
public class voterMenu extends voters{
    Scanner input= new Scanner(System.in);
    committee com;
    candidate cand;
            
    public voterMenu(String id, String name, String nationality, int age) {
        super(id, name, nationality, age);}
    
    public void getCandidates(){
        int counter=0; 
        while (counter<candidatesList.size())
        {System.out.println("to vote for "+candidatesList.get(counter).getName()+" "+candidatesList.get(counter).getNationality()+" "+candidatesList.get(counter).getParty()+" "+candidatesList.get(counter).getCampaign()+" give "+(counter+1));
        counter++;}}
    
    public void getAwareness() {
        if(awareness[0].isEmpty()){System.out.println("n awareness yet");}
        else{System.out.println(awareness[0]);}}
    
    public void getCampign() {
        int counter=0;
        candidate temp;
        while (counter<campign.size())
            {temp=candidatesList.get(counter);
            System.out.println("to campain of "+temp.getName()+" "+candidatesList.get(counter).getNationality()+" "+candidatesList.get(counter).getParty()+" give "+(counter+1));
            counter++;}}
    
    public void camp(int num){
        num--;
        candidate temp=candidatesList.get(num);
        System.out.println(campign.get(temp));}
    
    
    public void vote(int num){
        num--;
        int temp=count.get(num)+1;
        count.set(num, temp);}
    
    public void votersMenu(){
        
        OUTER:
        while (true) {
            System.out.println();
            System.out.println("..........what do you want to do here.........");
            System.out.println("      to get candidates       (give 1)");
            System.out.println("      to vote                 (give 2)");
            System.out.println("      get result              (give 3)");
            System.out.println("      get awareness           (give 4)");
            System.out.println("      exit                    (give 5)");
            int firstInput= input.nextInt();
            switch (firstInput) {
                case 1:
                    this.getCandidates();                    
                    break;
                case 2:
                    this.getCandidates();
                    int secondInput=input.nextInt();
                    this.vote(secondInput);
                    break;
                case 3:
                    getWinnerAnouncement();
                    break;
                case 4:
                    getAwareness();
                    break;
                case 5:
                    break OUTER;
                default:
                    break;}}}}
