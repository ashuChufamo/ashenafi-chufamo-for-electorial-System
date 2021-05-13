package electorialsystem;
public class committee extends person implements informatics{
    
    private static int winVote=0;
    private static candidate winnerCand=null;
    private static String winnerAnouncement="nothing yet";

    
    public static int getWinVote() {
        return winVote;}

    public static void setWinVote(int aWinVote) {
        winVote = aWinVote;}

    public static candidate getWinnerCand() {
        return winnerCand;}

    public static void setWinnerCand(candidate aWinnerCand) {
        winnerCand = aWinnerCand;}

    public static void getWinnerAnouncement() {
        System.out.println(winnerAnouncement);
    }

    public static void setWinnerAnouncement(String aWinnerAnouncement) {
        winnerAnouncement = aWinnerAnouncement;}
    
    public String getAwareness() {
        return awareness[0];}

    public void setAwareness(String awarenes) {
        awareness[0] = awarenes;}
    
    public committee(String name,String id,int age, String nationalty) {
        this.setNationality(nationalty);
        this.setAge(age);
        this.setId(id);
        this.setName(name);}
    
    public void registerCandidate(String name,String Id){
        candidate.put(name,Id);
        count.add(0);
        campain.add(null);}        

    public void registerVoters(String name,String Id){
          voter.put(name,Id);}
    
    public static void countVote(){
        
        int counter=0;
        while (counter<count.size()){
            ballotBox.put( count.get(counter),candidatesList.get(counter));
            counter++;}}
    
    public static void anounceVote(){
        
        int counter=0;
        while (counter<ballotBox.size()){            
            System.out.println("The candidate "+candidatesList.get(counter)+" got "+count.get(counter)+" votes");
            counter++;}}
    
    public static void winner(){
        
        int counter=0;
        while (counter<count.size()){
            if (getWinVote()<count.get(counter)){
                setWinVote(count.get(counter));
                setWinnerCand(candidatesList.get(counter));
                }
            
            counter++;}}
    
    public static void anounceWinner(){
        setWinnerAnouncement(("The winner is "+ getWinnerCand().getName() +" with total vote of "+getWinVote()));}}
    

