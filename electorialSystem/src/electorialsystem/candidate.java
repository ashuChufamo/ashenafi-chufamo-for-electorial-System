package electorialsystem;
public class candidate extends person implements informatics{
   
    private String party;
    private String campaign;
    
    public String getParty() {
        return party;}

    public void setParty(String party) {
        this.party = party;}
    
    public String getCampaign() {
        return campaign;}

    public void setCampaign(String campaign) {
        this.campaign=campaign;}

    public candidate(String name,String Id,int age,String nationality,String party,String campaign) {
        this.setAge(age);
        this.setId(Id);
        this.setName(name);
        this.setParty(party);
        this.setNationality(nationality);
        this.setCampaign(campaign);}}

   
