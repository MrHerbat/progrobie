public class Console extends Computer
{
    String buttonLayoutName;

    public Console(String brandOfCPU, int ddrOfRAM, boolean hasElectricity, String buttonLayoutName) {
        super(brandOfCPU, ddrOfRAM, hasElectricity);
        this.buttonLayoutName = buttonLayoutName;
    }
}
