public class Deciduous extends Tree
{
    String leavesColor;
    boolean hasEatableFruits;

    public Deciduous(String climate, boolean growsInWater, int heightInMeters, double circumferenceInMeters, String leavesColor, boolean hasEatableFruits) {
        super(climate, growsInWater, heightInMeters, circumferenceInMeters);
        this.leavesColor = leavesColor;
        this.hasEatableFruits = hasEatableFruits;
    }

    @Override
    public void writeParameters()
    {
        super.writeParameters();
        System.out.println("Leaves color: "+leavesColor);
        System.out.println("Does it have eatable fruits? "+(hasEatableFruits?"Yes":"No"));
    }
}
