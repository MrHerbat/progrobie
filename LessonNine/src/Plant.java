public class Plant
{
    String climate;
    boolean growsInWater;

    public Plant(String climate, boolean growsInWater) {
        this.climate = climate;
        this.growsInWater = growsInWater;
    }

    public void writeParameters()
    {
        System.out.println("Climate: "+climate);
        System.out.println("Does it grow in water? "+(growsInWater?"Yes":"No"));
    }
}
