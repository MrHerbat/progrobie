package Armory;

public enum Rarity
{
    ADMIN(9999,9999),
    OLD(0,0),
    COMMON(2,2),
    RARE(4,4),
    MYSTIC(6,6),
    MYTHICAL(8,8),
    GODLY(12,12);

    private int dmgMod;
    private int defMod;

    Rarity(int dmgMod, int defMod) {
        this.dmgMod = dmgMod;
        this.defMod = defMod;
    }

    public int getDmgMod() {
        return dmgMod;
    }

    public int getDefMod() {
        return defMod;
    }
}
