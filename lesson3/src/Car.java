public class Car
{
    int speed = 100;
    int numberOfWheels = 4;
    double engineCapacity;
    boolean isElectric = true;
    String color;
    String brand;
    String model;

    void turnRight()
    {
        System.out.println("Włączam prawy kierunkowskaz.");
        System.out.println("Sprawdzam czy nic nie jedzie .");
        System.out.println("Skręcam w prawo.");
    }
    void turnLeft()
    {
        System.out.println("Włączam lewy kierunkowskaz.");
        System.out.println("Sprawdzam czy nic nie jedzie .");
        System.out.println("Skręcam w lewo.");
    }
    void stopTheCar()
    {
        System.out.println("Powoli zwolnij.");
        System.out.println("Zatrzymaj pojazd.");
        System.out.println("Wrzuć luźny bieg.");
    }
    void parkTheCar()
    {
        System.out.println("Zjedź na pobocze lub miejsce parkingowe.");
        System.out.println("Zatrzymaj pojazd, wrzuć luźny bieg i zaciągnij hamulec ręczny.");
        System.out.println("Zdejmij nogi z pedałów i wyciągnij kluczyk.");
    }
    void startTheEngine()
    {
        System.out.println("Wejdź do pojazdu.");
        System.out.println("Wsadź kluczyk do stacyjki.");
        System.out.println("Naciśnij nogą na sprzęgło i przekręć kluczyk.");
    }
    void driveBack()
    {
        System.out.println("Powoli zwolnij.");
        System.out.println("Wrzuć bieg do tyłu.");
        System.out.println("Delikatnie naciśnij na pedał gazu.");
    }
    void speedIncrease()
    {
        speed+=60;
    }
    int carSpeed2()
    {
        return speed;
    }
    String carColor2()
    {
        return color;
    }
    String carBrand2()
    {
        return brand;
    }
    int amountOfWheels2()
    {
        return numberOfWheels;
    }
    boolean isCarElectric2()
    {
        return isElectric;
    }
    String carModel2()
    {
        return model;
    }
    void carSpeed()
    {
        System.out.println("Car speed: " + speed);
    }
    void carColor()
    {
        System.out.println("Color of the car: " + color);
    }
    void carBrand()
    {
        System.out.println("Brand of the car: " + brand);
    }
    void amountOfWheels()
    {
        System.out.println("Number of wheels in the car: " + numberOfWheels);
    }
    void isCarElectric()
    {
        System.out.println("Is this car electric?: " + isElectric);
    }
    void carModel()
    {
        System.out.println("Model of the car " + model);
    }

    public Car()
    {
        this.speed = speed;
        this.numberOfWheels = numberOfWheels;
        this.engineCapacity = engineCapacity;
        this.isElectric = isElectric;
        this.color = color;
        this.brand = brand;
        this.model = model;
    }
}
