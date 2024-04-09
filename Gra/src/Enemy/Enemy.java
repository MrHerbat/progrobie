package Enemy;
import java.lang.Math;
public class Enemy
{
    Enemies[] enemyType = new Enemies[]{Enemies.GLUE_SLIME,Enemies.W0LF3$,Enemies.MISSING_NO,Enemies.B1RD};

    private int dmg;
    private int def;
    private int maxHp;
    private int currentHp;
    private int maxExp;
    private int minExp;
    private int range;
    public int exp;
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

    public int getDmg() {
        return dmg;
    }

    public int getDef() {
        return def;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getRange() {
        return range;
    }
}
