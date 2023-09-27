public class Player
{
    LeftHand lHand;
    RightHand rHand;
    String playerName;
    int playerExperience;
    int maxPlayerExperience;
    int playerLevel;
    PlayerClass playerClass;

    public Player(int playerExperience, int maxPlayerExperience, int playerLevel)
    {
        this.lHand = new LeftHand();
        this.rHand = new RightHand();
        this.playerExperience = playerExperience;
        this.maxPlayerExperience = maxPlayerExperience;
        this.playerLevel = playerLevel;
        this.playerClass = new PlayerClass();
    }
}
