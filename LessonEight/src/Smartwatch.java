public class Smartwatch extends Computer
{

    boolean canMeasureHeartRate;

    public Smartwatch(String brandOfCPU, int ddrOfRAM, boolean hasElectricity, boolean canMeasureHeartRate) {
        super(brandOfCPU, ddrOfRAM, hasElectricity);
        this.canMeasureHeartRate = canMeasureHeartRate;
    }
}
