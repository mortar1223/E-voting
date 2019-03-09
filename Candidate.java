public class Candidate {
    String name;
    String office;
    String party;

    public Candidate(String name, String office, String party){
        this.name = name;
        this.office = office;
        this.party = party;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
