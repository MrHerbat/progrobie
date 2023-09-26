public class Player
{
    LeftHand lHand;
    RightHand rHand;
    float bodyHitPoints;
    float lLegHitPoints;
    float rLegHitPoints;
    float headHitPoints;
    String playerName;
    int playerExperience;
    int maxPlayerExperience;
    int playerLevel;
    PlayerClass playerClass;

    public Player(int playerExperience, int maxPlayerExperience, int playerLevel)
    {
        this.lHand = lHand;
        this.rHand = rHand;
        this.bodyHitPoints = bodyHitPoints;
        this.lLegHitPoints = lLegHitPoints;
        this.rLegHitPoints = rLegHitPoints;
        this.headHitPoints = headHitPoints;
        this.playerName = playerName;
        this.playerExperience = playerExperience;
        this.maxPlayerExperience = maxPlayerExperience;
        this.playerLevel = playerLevel;
        this.playerClass = playerClass;
    }
}
