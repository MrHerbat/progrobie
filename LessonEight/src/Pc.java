public class Pc extends Computer
{
    boolean additionalDevices;

    public Pc(String brandOfCPU, int ddrOfRAM, boolean hasElectricity, boolean additionalDevices) {
        super(brandOfCPU, ddrOfRAM, hasElectricity);
        this.additionalDevices = additionalDevices;
    }
}
