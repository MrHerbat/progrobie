public class Tree extends Plant
{
    int heightInMeters;
    double circumferenceInMeters;

    public Tree(String climate, boolean growsInWater, int heightInMeters, double circumferenceInMeters) {
        super(climate, growsInWater);
        this.heightInMeters = heightInMeters;
        this.circumferenceInMeters = circumferenceInMeters;
    }

    @Override
    public void writeParameters()
    {
        super.writeParameters();
        System.out.println("Height in meters: "+heightInMeters+"m");
        System.out.println("Circumference in meters: "+circumferenceInMeters+"m");
    }
}
