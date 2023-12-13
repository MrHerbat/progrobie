public class Console extends Computer
{
    String buttonLayout;

    public Console(String brandOfCPU, int ddrOfRAM, boolean hasElectricity, String buttonLayout) {
        super(brandOfCPU, ddrOfRAM, hasElectricity);
        this.buttonLayout = buttonLayout;
    }
}
