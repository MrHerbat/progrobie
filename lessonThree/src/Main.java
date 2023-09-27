public class Main {
    public static void main(String[] args)
    {
        Car samochod = new Car();
        samochod.startTheEngine();
        System.out.println();
        samochod.turnRight();
        System.out.println();
        samochod.turnLeft();
        System.out.println();
        samochod.driveBack();
        System.out.println();
        samochod.stopTheCar();
        System.out.println();
        samochod.parkTheCar();
        System.out.println(samochod.speed);
        samochod.speedIncrease();
        System.out.println();
        System.out.println(samochod.speed);

        samochod.carSpeed();
        samochod.amountOfWheels();
        samochod.brand = "Opel";
        samochod.carBrand();
        samochod.isCarElectric();
        samochod.color = "White";
        samochod.carColor();
        samochod.model = "Corsa";
        samochod.carModel();

        System.out.println(samochod.carBrand2());
        System.out.println(samochod.carSpeed2());
        System.out.println(samochod.isCarElectric2());
        System.out.println(samochod.amountOfWheels2());
        System.out.println(samochod.carColor2());
        System.out.println(samochod.carModel2());

    }
}