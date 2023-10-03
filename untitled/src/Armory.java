public class Armory
{
    Weapon rustyShortSword = new Weapon("Rusty Short Sword", "One-handed Swords/Axes", "Common", 2, 7, "Slashing","Bludgeoning", false, 1, 0, 5);
    Weapon oldShortBow = new Weapon("Old Short Bow", "Short Bows/Light Crossbows", "Common", 2, 7, "Piercing","Bludgeoning", true, true, "Arrows", 6, 1, 5);
    Weapon rustyDagger = new Weapon("Rusty Dagger", "Daggers", "Common", 1, 4, "Slashing","Piercing", false, 1, 0, 5);
    Weapon brokenStaff = new Weapon("Broken Staff", "Staffs/Wands", "Common", 2, 8, "Magic", "Bludgeoning", true, true, "Mana", 8, 1, 5);

}
void weaponDamageRandomizer(Weapon weapon)
{
     int wdRange = weapon.maxWeaponDamage - weapon.minWeaponDamage + 1;
     int wd = (int)((Math.random() * wdRange ) + weapon.minWeaponDamage);
}
