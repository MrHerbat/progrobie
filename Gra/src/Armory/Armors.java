package Armory;

public enum Armors
{
   BROKEN_SHIELD(3,1,"heavy",Rarity.OLD),
   FADED_ROBES(2,4,"robes",Rarity.OLD),
   SHADY_CLOAK(3,3,"light",Rarity.OLD),
    LEATHER_JACKET(4,2,"medium",Rarity.OLD),
    RUSTY_CHAINMAIL(5,1,"heavy",Rarity.OLD);


    private int def;
    private int magicDef;
   private String type;
   private Rarity rarity;

    Armors(int def, int magicDef, String type, Rarity rarity) {
        this.def = def;
        this.magicDef = magicDef;
        this.type = type;
        this.rarity = rarity;
    }

    public int getDef() {
        return def;
    }

    public int getMagicDef() {
        return magicDef;
    }

    public String getType() {
        return type;
    }

    public Rarity getRarity() {
        return rarity;
    }
}
