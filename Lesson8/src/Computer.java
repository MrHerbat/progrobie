public class Computer
{
    String brandOfCPU;
    int ddrOfRAM;
    boolean hasElectricity;

    public Computer(String brandOfCPU, int ddrOfRAM, boolean hasElectricity) {
        this.brandOfCPU = brandOfCPU;
        this.ddrOfRAM = ddrOfRAM;
        this.hasElectricity = hasElectricity;
    }

    public void isWorking(boolean hasElectricity, String brandOfCPU)
    {
        if(hasElectricity && brandOfCPU != null)
        {
            System.out.println("IT'S ALIVE!");
        } else {
            System.out.println("IT'S DEAD!");
        }
    }

    public void specificationOfCPU(String brandOfCPU, int ddrOfRAM)
    {
        System.out.println("Brand of CPU: "+brandOfCPU+" | RAM DDR: "+ddrOfRAM);
    }
}
