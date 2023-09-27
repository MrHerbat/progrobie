public class Armory
{
    Weapon rustyShortSword = new Weapon("Rusty Short Sword", 1, "Common", 2, 7, 1, false, 1, 0, 5);
    Weapon oldShortBow = new Weapon("Old Short Bow", 6, "Common", 2, 7, 3, true, true, "Arrows", 6, 1, 5);
    Weapon rustyDagger = new Weapon("Rusty Dagger", 5, "Common", 1, 4, 1, false, 1, 0, 5);
    Weapon brokenStaff = new Weapon("Broken Staff", 8, "Common", 2, 8, 4, true, true, "Mana", 8, 1, 5);


    void weaponTypeIdentifier(Weapon weapon)
    {
        switch (weapon.weaponType)
        {
            case (1):
                System.out.println("One-handed Swords/Axes");
                break;
            case (2):
                System.out.println("One-handed Blunt Weapon");
                break;
            case (3):
                System.out.println("Two-handed Swords/Axes");
                break;
            case (4):
                System.out.println("Two-handed Blunt Weapon");
                break;
            case (5):
                System.out.println("Daggers");
                break;
            case (6):
                System.out.println("Short Bows/Light Crossbows");
                break;
            case (7):
                System.out.println("Long Bows/Heavy Crossbows");
                break;
            case (8):
                System.out.println("Staffs/Wands");
                break;
        }
    }
    void weaponDamageTypeIdentifier(Weapon weapon)
    {
        switch (weapon.weaponDamageType)
        {
            case (1):
                System.out.println("Slashing");
                break;
            case (2):
                System.out.println("Bludgeoning");
                break;
            case (3):
                System.out.println("Piercing");
                break;
            case (4):
                System.out.println("Magic");
                break;
        }
    }
    void weaponDamageRandomizer(Weapon weapon)
    {
        int wdRange = weapon.maxWeaponDamage - weapon.minWeaponDamage + 1;
        int wd = (int)((Math.random() * wdRange ) + weapon.minWeaponDamage);
    }

}
