public class PlayerClass
{
    String className;
    int dexterity;
    int strength;
    int charisma;
    int intelligence;
    int endurance;
    float speed;
    float hitPoints;
    float maxHitPoints;

    public PlayerClass(String className, int dexterity, int strength, int charisma, int intelligence,
                       int endurance, float speed, int hitPoints, int maxHitPoints)
    {
        this.className = className;
        this.dexterity = dexterity;
        this.strength = strength;
        this.charisma = charisma;
        this.intelligence = intelligence;
        this.endurance = endurance;
        this.speed = speed;
        this.hitPoints = hitPoints;
        this.maxHitPoints = maxHitPoints;
    }
}
