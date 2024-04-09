package Player;

public enum Classes
{
    //hitDice,atk proficiency, armor proficiency, weapon proficiency,mana/rage/shadow dice

    EMPTY(0,0,"","",""),
    MAGE(14,40,"robes","wands","magic"),
    RANGER(25,20,"medium","ranged","ranged"),
    ROGUE(20,"light","finesse","melee"),
    FIGHTER(30,"heavy","long","melee");

    private int hitPoints, manaPoints, ragePoints;
    public String armorProficiency, weaponProficiency, atkProficiency;

    Classes(int hitPoints, int manaPoints, String armorProficiency, String weaponProficiency, String atkProficiency) {
        this.hitPoints = hitPoints;
        this.manaPoints = manaPoints;
        this.armorProficiency = armorProficiency;
        this.weaponProficiency = weaponProficiency;
        this.atkProficiency = atkProficiency;
    }

    Classes(int hitPoints, String armorProficiency, String weaponProficiency, String atkProficiency) {
        this.hitPoints = hitPoints;
        this.armorProficiency = armorProficiency;
        this.weaponProficiency = weaponProficiency;
        this.atkProficiency = atkProficiency;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public int getRagePoints() {
        return ragePoints;
    }

    public String getArmorProficiency() {
        return armorProficiency;
    }

    public String getWeaponProficiency() {
        return weaponProficiency;
    }

    public String getAtkProficiency() {
        return atkProficiency;
    }
}