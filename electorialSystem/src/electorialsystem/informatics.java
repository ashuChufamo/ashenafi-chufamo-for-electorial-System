package electorialsystem;
import java.util.*;
public interface informatics {
    HashMap <Integer,candidate> ballotBox= new HashMap<>();
    HashMap <String,String> commitees= new HashMap<>();
    HashMap <String,String> voter= new HashMap<>();
    HashMap <String,String> candidate= new HashMap<>();
    ArrayList <Integer> count= new ArrayList<>();
    ArrayList <candidate> candidatesList= new ArrayList<>();
    ArrayList <voters> votersList= new ArrayList<>();
    ArrayList <committee> committeeList= new ArrayList<>();
    ArrayList <String> campain= new ArrayList<>();
    primeMinister [] PM = new primeMinister[1];
    HashMap <candidate,String> campign=new HashMap<>();
    String [] awareness = new String[1];
}
