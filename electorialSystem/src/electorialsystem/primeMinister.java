package electorialsystem;
public class primeMinister extends person implements informatics{
    
    public primeMinister(String name,String id,int age, String nationality) {
        this.setAge(age);
        this.setNationality(nationality);
        this.setId(id);
        this.setName(name);}
    
    public void registerCommittee(String name,String Id){
        commitees.put(name,Id);}}
