package Domain;

public class Referee {
    private int refereeID;
    private String name;
    private String nationality;
    private int competitionID;

    public Referee(int refereeID, String name, String nationality, int competitionID) {
        this.refereeID = refereeID;
        this.name = name;
        this.nationality = nationality;
        this.competitionID = competitionID;
    }

    public int getRefereeID(){
        return refereeID;
    }
    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getCompetitionID(){
        return competitionID;
    }
} 