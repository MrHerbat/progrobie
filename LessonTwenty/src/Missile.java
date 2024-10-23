import java.util.ArrayList;
import java.util.Random;

public class Missile
{
    ArrayList<Shrapnel> shrapnelList;
    Random rand = new Random();
    int missileId;

    public Missile(int missileId) {
        this.missileId = missileId;
    }

    class Shrapnel
    {
        ArrayList<Shrapnel> subShrapnelList;
        String shrapnelId;
        int x,y,z;
        int shrapnelAmount;


        public Shrapnel(String shrapnelId, int shrapnelAmount) {
            this.shrapnelId = shrapnelId;
            this.shrapnelAmount = shrapnelAmount;
            this.x = rand.nextInt(10+10)-10;
            this.y = rand.nextInt(10+10)-10;
            this.z = rand.nextInt(10+10)-10;
        }
        public Shrapnel(String shrapnelId) {
            this.shrapnelId = shrapnelId;
            this.x = rand.nextInt(10+10)-10;
            this.y = rand.nextInt(10+10)-10;
            this.z = rand.nextInt(10+10)-10;
        }
        void generateShrapnel(int amount)
        {
            subShrapnelList = new ArrayList<>();
            for (int i = 0; i < amount; i++) {
                subShrapnelList.add(new Shrapnel((shrapnelId+"sub"+i)));
                subShrapnelList.get(i).x+=rand.nextInt(10+10)-10;
                subShrapnelList.get(i).y+=rand.nextInt(10+10)-10;
                subShrapnelList.get(i).z+=rand.nextInt(10+10)-10;
                System.out.println(shrapnelId+
                        " - Generated subfragment "+subShrapnelList.get(i).shrapnelId+
                        " | hitted coordinates: "+
                        subShrapnelList.get(i).x+"x,"+
                        subShrapnelList.get(i).y+"y,"+
                        subShrapnelList.get(i).z+"z");
            }
        }

    }

    void generateShrapnel()
    {
        shrapnelList = new ArrayList<>();
        int amount = 0;
        amount = rand.nextInt(5)+1;
        for (int i = 0; i < amount; i++) {
            shrapnelList.add(new Shrapnel(("shr"+i), rand.nextInt(5)+1));
            System.out.println("Missile"+missileId+
                    " - Generated shrapnel "+ shrapnelList.get(i).shrapnelId+
                    " | hitted coordinates: "+
                    shrapnelList.get(i).x+"x,"+
                    shrapnelList.get(i).y+"y,"+
                    shrapnelList.get(i).z+"z");
                    shrapnelList.get(i).generateShrapnel(shrapnelList.get(i).shrapnelAmount);
        }
        checkForShrapnelCollision(shrapnelList);
    }


    void checkForShrapnelCollision(ArrayList<Shrapnel> list)
    {


    }
    boolean CollisionChecker(Shrapnel s1, Shrapnel s2)
    {
        return s1.x==s2.x && s1.y==s2.y && s1.z==s2.z;
    }
}
