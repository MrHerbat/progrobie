public class Main {
    public static void main(String[] args)
    {
        Computer computer = new Computer("Intel", 4, true);
//        computer.isWorking(computer.hasElectricity, computer.brandOfCPU);
//        computer.specificationOfCPU(computer.brandOfCPU, computer.ddrOfRAM);

        Smartphone smartphone = new Smartphone("Qualcomm", 3,true, 6.1f);
//        System.out.println("Smartphone specification: "+smartphone.brandOfCPU+" | "+smartphone.ddrOfRAM+" | "+smartphone.hasElectricity+" | "+smartphone.screenDiagonal);
//        smartphone.isWorking(smartphone.hasElectricity, smartphone.brandOfCPU);
//        smartphone.specificationOfCPU(smartphone.brandOfCPU, smartphone.ddrOfRAM);

        Console console = new Console("AMD",4,false,"figures");
//        System.out.println("Console specification: "+console.brandOfCPU+" | "+console.ddrOfRAM+" | "+console.hasElectricity+" | "+console.buttonLayoutName);
//        console.isWorking(console.hasElectricity, console.brandOfCPU);
//        console.specificationOfCPU(console.brandOfCPU, console.ddrOfRAM);

        Smartwatch smartwatch = new Smartwatch("Intel", 4,true,true);
//        System.out.println("Smartwatch specification: "+smartwatch.brandOfCPU+" | "+smartwatch.ddrOfRAM+" | "+smartwatch.hasElectricity+" | "+smartwatch.canMeasureHeartRate);
//        smartwatch.isWorking(smartwatch.hasElectricity, smartwatch.brandOfCPU);
//        smartwatch.specificationOfCPU(smartwatch.brandOfCPU, smartwatch.ddrOfRAM);

        Pc pc = new Pc("AMD", 4, true,true);
//        System.out.println("PC specification: "+pc.brandOfCPU+" | "+pc.ddrOfRAM+" | "+pc.hasElectricity+" | "+pc.additionalDevices);
//        pc.isWorking(pc.hasElectricity, pc.brandOfCPU);
//        pc.specificationOfCPU(pc.brandOfCPU, pc.ddrOfRAM);

        Object[] object = new Object[4];
        object[0] = smartphone;
        object[1] = console;
        object[2] = smartwatch;
        object[3] = pc;
        Computer[] computerArray = new Computer[4];
        computerArray[0] = smartphone;
        computerArray[1] = console;
        computerArray[2] = smartwatch;
        computerArray[3] = pc;

    }
}