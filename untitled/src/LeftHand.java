public class LeftHand
{
    Weapon weapon;
    public LeftHand()
    {
        Weapon weapon = new Weapon("Fist", 1, "Common", 1f, 1, false, 1, 0, 0);
    }
    public void Equip(Weapon weapon)
    {
        this.weapon = weapon;
    }
}
