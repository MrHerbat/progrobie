public class Bus extends Car
{
    int amountOfSeats = 45;
    boolean hasAutomaticDoors = true;


    @Override
    void parameters()
    {
        System.out.println("Amount of seats in the bus: "+amountOfSeats);
        System.out.println("Does the bus have automatic doors? "+(hasAutomaticDoors?"Yes":"No"));
    }
}
