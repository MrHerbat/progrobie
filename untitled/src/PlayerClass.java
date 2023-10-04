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

    int characterClass;

    void classSelector(int characterClass)
    {
        switch (characterClass)
        {
            case(1):
                className = "Warrior";
                hitPoints = 10f;
                maxHitPoints = 10f;
                endurance = 3;
                strength = 4;
                charisma = 2;
                dexterity = 1;
                intelligence = 1;
                speed = 1f;
                break;
            case(2):
                className = "Ranger";
                hitPoints = 9f;
                maxHitPoints = 9f;
                endurance = 1;
                strength = 3;
                charisma = 1;
                dexterity = 4;
                intelligence = 2;
                speed = 2f;
                break;
            case(3):
                className = "Wizard";
                hitPoints = 6f;
                maxHitPoints = 6f;
                endurance = 2;
                strength = 1;
                charisma = 3;
                dexterity = 2;
                intelligence = 4;
                speed = 1.5f;
                break;
            case(4):
                className = "Rouge";
                hitPoints = 8f;
                maxHitPoints = 8f;
                endurance = 2;
                strength = 2;
                charisma = 3;
                dexterity = 4;
                intelligence = 1;
                speed = 3f;
                break;
        }
    }

    public PlayerClass()
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
