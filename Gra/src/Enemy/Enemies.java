package Enemy;

public enum Enemies
{
    GLUE_SLIME(15,5,3,10,15,45),
    W0LF3$(10,10,2,12,30,90),
    MISSING_NO(20,3,8,35,50,150),
    B1RD(5,4,0,5,20,60);

    private int speed, atk, def, hp, minExp, maxExp;

    Enemies(int speed, int atk, int def, int hp, int minExp, int maxExp) {
        this.speed = speed;
        this.atk = atk;
        this.def = def;
        this.hp = hp;
        this.minExp = minExp;
        this.maxExp = maxExp;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getHp() {
        return hp;
    }

    public int getMinExp() {
        return minExp;
    }

    public int getMaxExp() {
        return maxExp;
    }
}
