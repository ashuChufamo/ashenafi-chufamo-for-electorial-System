package electorialsystem;
public abstract class person implements informatics {
    private String name;
    private String Id;    
    private int age;
    private String nationality;

    public String getName(){
        return name;    }

    public void setName(String name){
        this.name = name;}

    public String getId(){
        return Id;}

    public void setId(String Id){
        this.Id = Id;}

    public int getAge() {
        return age;}

    public void setAge(int age) {
        this.age = age;}

    public String getNationality() {
        return nationality;}

    public void setNationality(String nationality) {
        this.nationality = nationality;}
   }
