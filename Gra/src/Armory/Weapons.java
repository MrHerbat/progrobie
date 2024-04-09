package Armory;

public enum Weapons
{
    RUSTY_DAGGER(3,"finesse","melee",1,5,Rarity.OLD),
    BROKEN_STAFF(6,"wand","magic",5,1,Rarity.OLD),
    OLD_BOW(6,"ranged","ranged",8,3,Rarity.OLD),
    BLUNT_SWORD(8,"long","melee",2,1,Rarity.OLD),
    DEBUG_OF_TEA(9999,"*","*",9999,9999,Rarity.ADMIN);


    private int dmg;
    private String type;
    private String atkProf;
    private int range;
    private int pen;
    private Rarity rarity;


    Weapons(int dmg, String type, String atkProf, int range, int pen, Rarity rarity) {
        this.dmg = dmg;
        this.type = type;
        this.atkProf = atkProf;
        this.range = range;
        this.pen = pen;
        this.rarity = rarity;
    }

    public int getDmg() {
        return dmg;
    }

    public String getType() {
        return type;
    }

    public String getAtkProf() {
        return atkProf;
    }

    public int getRange() {
        return range;
    }

    public int getPen() {
        return pen;
    }

    public Rarity getRarity() {
        return rarity;
    }
}
