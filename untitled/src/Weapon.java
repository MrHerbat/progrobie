public class Weapon
{
        String weaponName;
        String weaponType;
        String weaponRarity;
        int maxWeaponDamage;
        int minWeaponDamage;
        int weaponDamageType;
        boolean isTwoHanded;
        boolean isRanged;
        String weaponAmmoType;
        int range;
        int timeToUse;
        int weaponValue;

    public Weapon(String weaponName, String weaponType, String weaponRarity, int maxWeaponDamage, int minWeaponDamage, String weaponDamageType, boolean isTwoHanded, int range, int timeToUse, int weaponValue)
    {
        this.weaponName = weaponName;
        this.weaponType = weaponType;
        this.weaponRarity = weaponRarity;
        this.maxWeaponDamage = maxWeaponDamage;
        this.minWeaponDamage = minWeaponDamage;
        this.weaponDamageType = weaponDamageType;
        this.isTwoHanded = isTwoHanded;
        this.range = range;
        this.timeToUse = timeToUse;
        this.weaponValue = weaponValue;
    }

    public Weapon(String weaponName, int weaponType, String weaponRarity, int maxWeaponDamage, int minWeaponDamage, int weaponDamageType,
                  boolean isTwoHanded, boolean isRanged, String weaponAmmoType, int range, int timeToUse, int weaponValue)
    {
        this.weaponName = weaponName;
        this.weaponType = weaponType;
        this.weaponRarity = weaponRarity;
        this.minWeaponDamage = minWeaponDamage;
        this.weaponDamageType = weaponDamageType;
        this.weaponDamageType = weaponDamageType;
        this.isTwoHanded = isTwoHanded;
        this.isRanged = isRanged;
        this.weaponAmmoType = weaponAmmoType;
        this.range = range;
        this.timeToUse = timeToUse;
        this.weaponValue = weaponValue;
    }
}
