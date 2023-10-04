public class Reputation
{
    int southReputation;
    int eastReputation;
    int westReputation;
    int northReputation;
    int centralReputation;
    int continentReputation;

    public Reputation()
    {
        this.southReputation = southReputation;
        this.eastReputation = eastReputation;
        this.westReputation = westReputation;
        this.northReputation = northReputation;
        this.centralReputation = centralReputation;
        this.continentReputation = continentReputation;
    }
    void setContinentReputation(int southReputation, int eastReputation, int westReputation, int northReputation, int centralReputation, int continentReputation)
    {
        continentReputation = southReputation+northReputation+westReputation+centralReputation+eastReputation;
    }
}
