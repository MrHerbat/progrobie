public class Weapon
{
        String weaponName;
        int weaponType;
        String weaponRarity;
        float weaponDamage;
        int weaponDamageType;
        boolean isTwoHanded;
        boolean isRanged;
        String weaponAmmoType;
        int range;
        int timeToUse;
        int weaponValue;

    public Weapon(String weaponName, int weaponType, String weaponRarity, float weaponDamage, int weaponDamageType, boolean isTwoHanded, int range, int timeToUse, int weaponValue)
    {
        this.weaponName = weaponName;
        this.weaponType = weaponType;
        this.weaponRarity = weaponRarity;
        this.weaponDamage = weaponDamage;
        this.weaponDamageType = weaponDamageType;
        this.isTwoHanded = isTwoHanded;
        this.range = range;
        this.timeToUse = timeToUse;
        this.weaponValue = weaponValue;
    }

    public Weapon(String weaponName, int weaponType, String weaponRarity, float weaponDamage, int weaponDamageType,
                  boolean isTwoHanded, boolean isRanged, String weaponAmmoType, int range, int timeToUse, int weaponValue)
    {
        this.weaponName = weaponName;
        this.weaponType = weaponType;
        this.weaponRarity = weaponRarity;
        this.weaponDamage = weaponDamage;
        this.weaponDamageType = weaponDamageType;
        this.isTwoHanded = isTwoHanded;
        this.isRanged = isRanged;
        this.weaponAmmoType = weaponAmmoType;
        this.range = range;
        this.timeToUse = timeToUse;
        this.weaponValue = weaponValue;
    }
}
