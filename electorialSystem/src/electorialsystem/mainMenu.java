package electorialsystem;
import java.util.Scanner;
public class mainMenu implements informatics {
    Scanner input= new Scanner(System.in);
    
     public void howToUse(){
        System.out.println();
        System.out.println("To use system first you must create a primeMinister object, because only the prime minister will assign the committee.");
        System.out.println("Then the committee will register voter and candidate. The committee can also give awareness and count and give the result.");
        System.out.println("Fillout the infomation on themselves, the candidate can give awareness.");
        System.out.println("Fillout the infomation on themselves, the voters can get the cadidate informaton, vote, get awareness");
        System.out.println("Everyone except the president can get resuults, but first the vote has to be counted by the committee");}
     
    public void menu1(){
               while(true){ 
        OUTER:
        while (true) {
            System.out.println();
            System.out.println("_____________This is a simple electronic electorial system for Ethiopia_____________");
            System.out.println("                    Who are you");
            System.out.println("             The primeMnister (give 1)");
            System.out.println("             Commitee         (give 2)");
            System.out.println("             Candidate        (give 3)");
            System.out.println("             Voter            (give 4)");
            try{
            int firstInput= input.nextInt();
            if (firstInput>0 && firstInput<5) {
                System.out.println("give your name");
                String name= input.next();
                System.out.println("give your id");
                String id= input.next();
                System.out.println("give your nationality");
                String nationality= input.next();
                System.out.println("give your age");
                int age= input.nextInt();
                switch (firstInput) {
                    
                    case 1:
                        primeMinisterMenu menu1= new primeMinisterMenu(name,id,age,nationality);
                        primeMinister prime= new primeMinister(name,id,age,nationality);
                        PM[0]=prime;
                        menu1.primeMinistermenu();
                        break OUTER;
                        
                    case 2:
                        committee com= new committee(name,id,age,nationality);
                        commiteeMenu comMenu= new commiteeMenu(name,id,age,nationality);
                        if (commitees.containsKey(name) && commitees.containsValue(id) && age>23 && nationality.equalsIgnoreCase("ethiopian")) {
                            committeeList.add(com);
                            comMenu.committeeMenu();} 
                        
                        else if (nationality.equalsIgnoreCase("ethiopian")==false){
                            System.out.println("you not ethiopian");
                            break OUTER;}
                        
                        else if(age<23){
                            System.out.println("you are underage");
                            break OUTER;}
                        
                        else {
                            System.out.println("sorry you arenot registered by the prime minister");
                            break OUTER;}
                        break;
                        
                    case 3:
                        System.out.println("give your party");
                        String party= input.next();
                        System.out.println("give your vote campign");
                        String Campaign= input.next();
                        candidateMenu candMenu= new candidateMenu(name,id,age,nationality,party,Campaign);
                        candidate cand= new candidate(name,id,age,nationality,party, Campaign);
                        candidatesList.add(cand);
                        if (candidate.containsKey(name) && candidate.containsValue(id) && age>21 && nationality.equalsIgnoreCase("ethiopian")) {
                        candMenu.candidatesMenu();}
                        
                        else if(age<21){
                            System.out.println("you are underage");
                            break OUTER;}
                        
                        else if (nationality.equalsIgnoreCase("ethiopian")==false){
                            System.out.println("you not ethiopian");
                            break OUTER;}
                        
                        else {
                            System.out.println("sorry you arenot registered by the committee");
                            break OUTER;}
                        break;
                        
                    case 4:
                        voterMenu civilMenu= new voterMenu(id,name,nationality,age);
                        voters civil= new voters(id,name,nationality,age);
                        votersList.add(civil);
                        if (voter.containsKey(name) && voter.containsValue(id) && age>18 && nationality.equalsIgnoreCase("ethiopian")) {
                            civilMenu.votersMenu();}
                        
                        else if (nationality.equalsIgnoreCase("ethiopian")==false){
                            System.out.println("you not ethiopian");
                            break OUTER;}
                        
                        else if(age<18){
                            System.out.println("you are underage");
                            break OUTER;}
                        
                        else {
                            System.out.println("sorry you arenot registered by the committee");
                            break OUTER;}   
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("invalid input");}}
            catch(Exception e){
                System.out.println();
                System.out.println(e);
                break;}
        }}}}