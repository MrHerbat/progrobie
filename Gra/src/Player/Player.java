package Player;

import Armory.Armors;
import Armory.Weapons;

public class Player
{
    Races playerRace = Races.ASCIIAN;
    Classes[] playerClass = new Classes[]{Classes.EMPTY,Classes.MAGE,Classes.RANGER,Classes.ROGUE,Classes.FIGHTER};
    public int classChoice;

    private Levels currentLevel = Levels.LEVEL_1;
    public long exp;
    private int hpModifier = currentLevel.getHpModifier();
    private int profModifier = currentLevel.getProfModifier();
    private int thingyModifier = currentLevel.getThingyModifier();
    private int maxHp = playerClass[classChoice].getHitPoints()*hpModifier;
    public int currentHp;
    private int maxMp = playerClass[classChoice].getManaPoints()*thingyModifier;
    private int currentMp = maxMp;
    private int speed = 10;
    public String name;
    public Equipment equipment = new Equipment();

    public Player() {
        this.exp = currentLevel.getExp();
        this.hpModifier = currentLevel.getHpModifier();
        this.profModifier = currentLevel.getProfModifier();
        this.thingyModifier = currentLevel.getThingyModifier();
        this.currentLevel = currentLevel;
        this.classChoice = classChoice;
        this.name = name;
    }



    @Override
    public String toString()
    {
        return name+"\n"+"Level: "+this.currentLevel+"\nRace: "+this.playerRace+"\nClass: "+this.playerClass[classChoice]+"\nHP: "+this.currentHp+"/"+this.maxHp+"\nMP: "+this.currentMp+"/"+this.maxMp;
    }
    public String battleToString()
    {
        return name+"\n"+"Level: "+this.currentLevel+"\nHP: "+this.currentHp+"/"+this.maxHp+"\nMP: "+this.currentMp+"/"+this.maxMp;
    }
    public void updateStats()
    {
        hpModifier = currentLevel.getHpModifier();
        profModifier = currentLevel.getProfModifier();
        thingyModifier = currentLevel.getThingyModifier();
        maxHp = playerClass[classChoice].getHitPoints()*hpModifier;
        currentHp = maxHp;
        maxMp = playerClass[classChoice].getManaPoints()*thingyModifier;
        currentMp = maxMp;
    }

    public void levelUp() {
        Levels level1 = Levels.LEVEL_0;
        for (Levels level : Levels.values()) {
            if (exp >= level.getExp()) {
                level1 = level;
            } else {
                break;
            }
        }
        if(level1!=currentLevel)
        {
            currentLevel=level1;
            System.out.println("CONGRATULATIONS! You Leveled Up to "+currentLevel);
            hpModifier = currentLevel.getHpModifier();
            profModifier = currentLevel.getProfModifier();
            thingyModifier = currentLevel.getThingyModifier();
            maxHp = playerClass[classChoice].getHitPoints()*hpModifier;
            currentHp = maxHp;
            maxMp = playerClass[classChoice].getManaPoints()*thingyModifier;
            currentMp = maxMp;
        }
    }
    public void setEquipment()
    {
        switch (classChoice)
        {
            case 1:
                equipment.armor = Armors.FADED_ROBES;
                equipment.mainHand = Weapons.BROKEN_STAFF;
                break;
            case 2:
                equipment.armor = Armors.LEATHER_JACKET;
                equipment.mainHand = Weapons.OLD_BOW;
                equipment.weaponOffHand = Weapons.RUSTY_DAGGER;
                break;
            case 3:
                equipment.armor = Armors.SHADY_CLOAK;
                equipment.mainHand = Weapons.RUSTY_DAGGER;
                equipment.weaponOffHand = Weapons.RUSTY_DAGGER;
                break;
            case 4:
                equipment.armor = Armors.RUSTY_CHAINMAIL;
                equipment.armorsOffHand = Armors.BROKEN_SHIELD;
                equipment.mainHand = Weapons.BLUNT_SWORD;
                break;
            default:
                System.out.println("Sorry, There's no class with this number");
                break;
        }
    }
    public String returnEquipment()
    {
        if(equipment.weaponOffHand==null)
        {
            return "Armor:"+equipment.armor+"\nMain hand: "+ equipment.mainHand+"\nOff Hand: "+equipment.armorsOffHand;
        }
        else
        {
            return "Armor:"+equipment.armor+"\nMain hand: "+ equipment.mainHand+"\nOff Hand: "+equipment.weaponOffHand;
        }
    }
    public int getDmg()
    {
        if(equipment.weaponOffHand!=null)
        {
            return (equipment.mainHand.getDmgRange()+equipment.weaponOffHand.getRange()+2)/2;
        }
        else
        {
            return this.equipment.mainHand.getDmgRange();
        }
    }

    public int getSpeed() {
        return speed;
    }
}
