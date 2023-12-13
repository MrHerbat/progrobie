public class Smartphone extends Computer
{
    float screenDiagonal;

    public Smartphone(String brandOfCPU, int ddrOfRAM, boolean hasElectricity, float screenDiagonal) {
        super(brandOfCPU, ddrOfRAM, hasElectricity);
        this.screenDiagonal = screenDiagonal;
    }
}
