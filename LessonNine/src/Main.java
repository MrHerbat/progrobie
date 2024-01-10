public class Main {
    public static void main(String[] args)
    {
//        Computer computer = new Computer();
//        Smartphone smartphone = new Smartphone();
//        Smartwatch smartwatch = new Smartwatch();
//        Laptop laptop = new Laptop();
//
//        computer.przywitajSie();
//        smartphone.przywitajSie();
//        smartwatch.przywitajSie();
//        laptop.przywitajSie();

        Plant plant = new Plant("temperate", false);
        Tree tree = new Tree("temperate", false, 12, 1.3d);
        Deciduous deciduous = new Deciduous("temperate", false, 12, 1.3d,"green", true);

        plant.writeParameters();
        System.out.println("-------------------");
        tree.writeParameters();
        System.out.println("-------------------");
        deciduous.writeParameters();

    }
}