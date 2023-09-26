public class RightHand
{
    float handHitPoints;
    Weapon weapon;
    public RightHand(int handHitPoints)
    {
        this.handHitPoints = handHitPoints;
        Weapon weapon = new Weapon("Fist", 1, "Common", 1f, 1, false, 1, 0, 0);
    }
    public void Equip(Weapon weapon)
    {
        this.weapon = weapon;
    }
}
