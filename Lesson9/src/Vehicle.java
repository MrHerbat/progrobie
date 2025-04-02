public class Vehicle
{
    public boolean isItALandVehicle = true;
    public double vehicleWeight = 4;


    void parameters()
    {
        System.out.println("Is it a land vehicle? "+(isItALandVehicle?"Yes":"No"));
        System.out.println("Weight of vehicle: "+vehicleWeight+"t");
    }
}
