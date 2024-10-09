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

        class subFragment extends Shrapnel
        {
            int subFId;
            int x,y,z;

            public subFragment(int shrapnelId, int shrapnelAmount, int subFId) {
                super(shrapnelId, shrapnelAmount);
                this.x = rand.nextInt(10+10)-10;
                this.y = rand.nextInt(10+10)-10;
                this.z = rand.nextInt(10+10)-10;
                this.subFId = subFId;
            }

        }
        void generateSubFragments(int amount)
        {
            for (int i = 0; i < amount; i++) {
                subFragment subFragment = new subFragment(shrapnelId,0,i);
                System.out.println("Shrapnel"+shrapnelId+" - Generated subFragment "+subFragment.subFId+"| hitted coordinates: "+subFragment.x+"x,"+subFragment.y+"y,"+subFragment.z+"z");

            }
        }

    }

    void generateShrapnel(int amount)
    {
        for (int i = 0; i < amount; i++) {
            Shrapnel shrapnel = new Shrapnel(i, rand.nextInt(5)+1);
            System.out.println("Missile"+missileId+" - Generated shrapnel "+shrapnel.shrapnelId+"| hitted coordinates: "+shrapnel.x+"x,"+shrapnel.y+"y,"+shrapnel.z+"z");
            shrapnel.generateSubFragments(shrapnel.shrapnelAmount);

        }
    }
}
