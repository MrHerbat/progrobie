package Armory;

public enum Weapons
{
    RUSTY_DAGGER(3,9,"finesse","melee",1,5,Rarity.OLD),
    BROKEN_STAFF(6,12,"wand","magic",5,8,Rarity.OLD),
    OLD_BOW(6,14,"ranged","ranged",8,3,Rarity.OLD),
    BLUNT_SWORD(8,14,"long","melee",2,1,Rarity.OLD),
    DEBUG_OF_TEA(9999,9999999,"*","*",9999,9999,Rarity.ADMIN);


    private int minDmg;
    private int maxDmg;
    private String type;
    private String atkProf;
    private int range;
    private int pen;
    private Rarity rarity;


    Weapons(int minDmg,int maxDmg, String type, String atkProf, int range, int pen, Rarity rarity) {
        this.minDmg = minDmg;
        this.maxDmg = maxDmg;
        this.type = type;
        this.atkProf = atkProf;
        this.range = range;
        this.pen = pen;
        this.rarity = rarity;
    }

    public int getDmgRange() {
        return (maxDmg-minDmg)+this.rarity.getDmgMod();
    }

    public String getType() {
        return type;
    }

    public String getAtkProf() {
        return atkProf;
    }

    public int getRange() {
        return this.range;
    }

    public int getPen() {
        return pen;
    }

    public Rarity getRarity() {
        return rarity;
    }
}
