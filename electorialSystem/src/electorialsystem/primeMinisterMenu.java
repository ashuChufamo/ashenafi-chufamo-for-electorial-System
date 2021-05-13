package electorialsystem;
import java.util.Scanner; 
public class primeMinisterMenu extends primeMinister{
Scanner input= new Scanner(System.in);

    public primeMinisterMenu(String name, String id, int age, String nationality) {
        super(name, id, age, nationality);}

    public void primeMinistermenu(){
        
    OUTER:
    while (true) {
        System.out.println();
        System.out.println("___________what do you want to do Mr. Prime minister_________");
        System.out.println("           to add committee      (give 1)");
        System.out.println("           to exit               (give 2)");
        int firstInput= input.nextInt();
        switch (firstInput) {
            case 1:
                System.out.println("how many committees");
                int counter= input.nextInt();
                while(counter > 0){
                    System.out.println("give his name");
                    String name= input.next();
                    System.out.println("give his id");
                    String id= input.next();
                    registerCommittee(name,id);
                    counter--;}
                break;
            case 2:
                break OUTER;
            default:
                System.out.println("invalid input");
                break;
        }
    }
}}
