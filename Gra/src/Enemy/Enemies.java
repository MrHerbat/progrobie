package Enemy;

public enum Enemies
{
    GLUE_SLIME(15,2,8,3,10,15,45,3,6),
    W0LF3$(10,3,9,2,12,30,90,5,1),
    MISSING_NO(20,3,5,8,35,50,150,3,2),
    B1RD(5,4,6,0,5,20,60,1,2);

    private int speed, minAtk,maxAtk, def, hp, minExp, maxExp, pen, range;

    Enemies(int speed, int minAtk,int maxAtk, int def, int hp, int minExp, int maxExp, int pen, int range) {
        this.speed = speed;
        this.minAtk = minAtk;
        this.def = def;
        this.hp = hp;
        this.minExp = minExp;
        this.maxExp = maxExp;
        this.pen = pen;
        this.range = range;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAtkRange() {
        return (maxAtk-minAtk)+1;
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

    public int getPen() {
        return pen;
    }

    public int getRange() {
        return range;
    }
}
