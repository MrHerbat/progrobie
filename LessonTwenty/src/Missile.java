import java.util.Random;

public class Missile
{
    Random rand = new Random();
    int missileId;

    public Missile(int missileId) {
        this.missileId = missileId;
    }

    class Shrapnel
    {
        int shrapnelId;
        int x,y,z;
        int shrapnelAmount;


        public Shrapnel(int shrapnelId, int shrapnelAmount) {
            this.shrapnelId = shrapnelId;
            this.shrapnelAmount = shrapnelAmount;
            this.x = rand.nextInt(10+10)-10;
            this.y = rand.nextInt(10+10)-10;
            this.z = rand.nextInt(10+10)-10;
        }
        public Shrapnel(int shrapnelId) {
            this.shrapnelId = shrapnelId;
            this.x = rand.nextInt(10+10)-10;
            this.y = rand.nextInt(10+10)-10;
            this.z = rand.nextInt(10+10)-10;
        }
        void generateShrapnel(int amount)
        {
            for (int i = 0; i < amount; i++) {
                Shrapnel shrapnel = new Shrapnel(i);
                System.out.println("Shrapnel"+shrapnelId+
                        " - Generated subfragment "+shrapnel.shrapnelId+
                        "| hitted coordinates: "+
                        (shrapnel.x+x)+"x,"+
                        (shrapnel.y+y)+"y,"+
                        (shrapnel.z+z)+"z");
            }
        }

    }

    void generateShrapnel(int amount)
    {
        for (int i = 0; i < amount; i++) {
            Shrapnel shrapnel = new Shrapnel(i, rand.nextInt(5)+1);
            System.out.println("Missile"+missileId+
                    " - Generated shrapnel "+shrapnel.shrapnelId+
                    "| hitted coordinates: "+
                    shrapnel.x+"x,"+
                    shrapnel.y+"y,"+
                    shrapnel.z+"z");
            shrapnel.generateShrapnel(shrapnel.shrapnelAmount);
        }
    }
}
