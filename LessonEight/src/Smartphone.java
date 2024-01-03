public class Smartphone extends Computer
{
    double screenDiagonal;

    public Smartphone(String brandOfCPU, int ddrOfRAM, boolean hasElectricity, double screenDiagonal) {
        super(brandOfCPU, ddrOfRAM, hasElectricity);
        this.screenDiagonal = screenDiagonal;
    }
}
