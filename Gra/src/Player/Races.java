package Player;

public enum Races
{
    //Exp,hitPointMultiplayer,prof bonus, bonusThingyMultiplayer

    //exp formula EXP=(2*LV)*(50*(LV/2))
    //str,ag,int,wis,con,
    HUMAN(1,1,1,1,1),
    ELF(0,3,0,2,0),
    DRACON(2,0,2,0,2),
    DWARF(2,0,0,0,3),
    ORC(3,0,0,0,2);

    private int str,ag,it,wis,con;

    Races(int str, int ag, int it, int wis, int con) {
        this.str = str;
        this.ag = ag;
        this.it = it;
        this.wis = wis;
        this.con = con;
    }

    public int getStr() {
        return str;
    }

    public int getAg() {
        return ag;
    }

    public int getIt() {
        return it;
    }

    public int getWis() {
        return wis;
    }

    public int getCon() {
        return con;
    }
}