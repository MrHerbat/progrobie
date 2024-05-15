package Armory;

public enum Armors
{
   BROKEN_SHIELD(1,1,"heavy",Rarity.OLD),
   FADED_ROBES(3,4,"robes",Rarity.OLD),
   SHADY_CLOAK(4,3,"light",Rarity.OLD),
    LEATHER_JACKET(5,2,"medium",Rarity.OLD),
    RUSTY_CHAINMAIL(6,1,"heavy",Rarity.OLD);


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
