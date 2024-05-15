package Enemy;
import java.lang.Math;
public class Enemy
{
    Enemies[] enemyType = new Enemies[]{Enemies.GLUE_SLIME,Enemies.W0LF3$,Enemies.MISSING_NO,Enemies.B1RD};
    public Enemies enemyHolder;

    private int dmg;
    private int def;
    private int maxHp;
    public int currentHp;
    private int maxExp;
    private int minExp;
    private int range;
    public int exp;
    private int pen;
    private int speed;

    public Enemy() {
        this.enemyHolder = enemyHolder;
        this.dmg = dmg;
        this.def = def;
        this.maxHp = maxHp;
        this.currentHp = currentHp;
        this.maxExp = maxExp;
        this.minExp = minExp;
        this.range = range;
        this.exp = exp;
        this.pen = pen;
        this.speed = speed;
    }

    public Enemies randomEnemy()
    {
        int n = (int)(Math.random()*4);
        if (n==0)
            return enemyType[0];
        if (n==1)
            return enemyType[1];
        if (n==2)
            return enemyType[2];
        if (n==3)
            return enemyType[2];
        else{
            return null;
        }
    }
    public int returnExp(Enemies enemy)
    {
        maxExp = enemy.getMaxExp();
        minExp = enemy.getMinExp();
        range = maxExp-minExp+1;
        exp=(int)(Math.random()*range)+minExp;

        return exp;
    }
    public void returnEnemyStats(Enemies enemies)
    {
        dmg = enemies.getAtkRange();
        pen = enemies.getPen();
        maxHp = enemies.getHp();
        currentHp = maxHp;
        def = enemies.getDef();
        range = enemies.getRange();
        speed = enemies.getSpeed();
    }
    @Override
    public String toString()
    {
        return enemyHolder+"\nHP:"+getCurrentHp()+"/"+getMaxHp();
    }

    public int getDmgRange() {
        return this.dmg;
    }

    public int getDef() {
        return this.def;
    }

    public int getCurrentHp()
    {
        return this.currentHp;
    }

    public int getMaxHp() {
        return this.maxHp;
    }

    public int getRange() {
        return this.range;
    }

    public int getPen() {
        return pen;
    }

    public int getSpeed() {
        return speed;
    }
}
