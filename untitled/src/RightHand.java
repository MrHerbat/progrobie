public class RightHand
{
    Weapon weapon;
    public RightHand()
    {
        Weapon weapon = new Weapon("Fist", 1, "Common", 1f, 1, false, 1, 0, 0);
    }
    public void Equip(Weapon weapon)
    {
        this.weapon = weapon;
    }
}
