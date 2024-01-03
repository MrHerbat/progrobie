public class Car extends Vehicle
{
    double maxSpeed = 65.4d;
    String brand = "Mercedes";


    @Override
    void parameters()
    {
        System.out.println("Max speed of the car: "+maxSpeed+"km/h");
        System.out.println("Brand of the car: "+brand);
    }
}
