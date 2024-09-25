public class Missile
{
    String className = this.getClass().getName();

    void generateShrapnel(int amount)
    {
        class Shrapnel
        {
            void createShrapnel(int number)
            {
                System.out.println(className+" - generated shrapnel "+number);
            }
        }
        for (int i = 0; i < amount; i++) {
            Shrapnel shrapnel = new Shrapnel();
            shrapnel.createShrapnel(i+1);
        }
    }
}
