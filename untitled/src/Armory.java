public class Armory
{
    Weapon rustyShortSword;
    Weapon oldShortBow;
    Weapon rustyDagger;
    Weapon brokenStaff;
    Weapon fist;
    Weapon weapon;

    int weaponDamageRandomizer(Weapon weapon)
    {
        int wdRange = weapon.maxWeaponDamage - weapon.minWeaponDamage + 1;
        int weaponDamage = (int)((Math.random() * wdRange ) + weapon.minWeaponDamage);
        return weaponDamage;
    }

    public Armory()
    {
        rustyShortSword = new Weapon("Rusty Short Sword", "One-handed Swords/Axes",
                "Common", 7, 2, "Slashing",
                "Bludgeoning", false, 1, 0, 5);
        oldShortBow = new Weapon("Old Short Bow", "Short Bows/Light Crossbows",
                "Common", 7, 2,
                "Piercing","Bludgeoning", true, true,
                "Arrows", 6, 1, 5);
        rustyDagger = new Weapon("Rusty Dagger", "Daggers",
                "Common", 4, 1, "Slashing",
                "Piercing", false, 1, 0, 5);
        brokenStaff = new Weapon("Broken Staff", "Staffs/Wands",
                "Common", 8, 2,
                "Magic", "Bludgeoning", true, true,
                "Mana", 8, 1, 5);
        fist = new Weapon("Fist", "Fists", "Common", 2, 1,
                "Bludgeoning" , "Bludgeoning",false, 1, 0, 0);
    }
}

