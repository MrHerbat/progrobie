import java.awt.*;

public class Computer {

    String CPUName;
    GraphicCard GPUName;
    String motherboardName;
    int amountOfMemoryInGB;
    Memory memoryType;
    boolean isIntegratedGPU;
    RAM amountOfRam;

    public Computer(String CPUName, String nameOfGraphicCard, String motherboardName, int amountOfMemoryInGB, String memoryType, boolean isIntegratedGPU, long amountOfRamInMB) {
        this.CPUName = CPUName;
        this.GPUName = new GraphicCard(nameOfGraphicCard);
        this.motherboardName = motherboardName;
        this.amountOfMemoryInGB = amountOfMemoryInGB;
        this.memoryType = new Memory(memoryType);
        this.isIntegratedGPU = isIntegratedGPU;
        this.amountOfRam = new RAM(amountOfRamInMB);
    }
}
