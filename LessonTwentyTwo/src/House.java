import java.util.ArrayList;
import java.util.Scanner;

public class House
{
    public class Kitchen
    {
        public void fillTheKitchen()
        {
            int a;
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter amount of doors: ");
            a = scan.nextInt();
            for (int i = 0; i < a; i++) doors.add(new Door());
        }
    }
    public class Bathroom
    {
        public class Shower
        {

        }
        public class Bathtub
        {

        }
        public class Sink
        {

        }
        public class Washer
        {

        }
        public class Cabinet
        {

        }

        ArrayList<Shower> showers = new ArrayList<>();
        ArrayList<Bathtub> bathtubs = new ArrayList<>();
        ArrayList<Sink> sinks = new ArrayList<>();
        ArrayList<Washer> washers = new ArrayList<>();
        ArrayList<Cabinet> cabinets = new ArrayList<>();

        public Bathroom() {
            this.showers = showers;
            this.bathtubs = bathtubs;
            this.sinks = sinks;
            this.washers = washers;
            this.cabinets = cabinets;
        }

        public String toString()
        {
            return ("This bathroom contains: \n - "+showers.size()+" shower/s \n - "+bathtubs.size()+" bathtub/s \n - "
                    +sinks.size()+" sink/s \n - "+washers.size()+" washer/s \n - "
                    +cabinets.size()+" cabinet/s");
        }


        public void fillTheBathroom()
        {
            int a;
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter amount of doors: ");
            a = scan.nextInt();
            for (int i = 0; i < a; i++) doors.add(new Door());
            System.out.print("Enter amount of showers: ");
            a = scan.nextInt();
            for (int i = 0; i < a; i++) showers.add(new Shower());
            System.out.print("Enter amount of bathtubs: ");
            a = scan.nextInt();
            for (int i = 0; i < a; i++) bathtubs.add(new Bathtub());
            System.out.print("Enter amount of sinks: ");
            a = scan.nextInt();
            for (int i = 0; i < a; i++) sinks.add(new Sink());
            System.out.print("Enter amount of washers: ");
            a = scan.nextInt();
            for (int i = 0; i < a; i++) washers.add(new Washer());
            System.out.print("Enter amount of cabinets: ");
            a = scan.nextInt();
            for (int i = 0; i < a; i++) cabinets.add(new Cabinet());
        }
    }
    public class Window
    {

    }
    public class Room
    {
        public void fillTheRoom()
        {
            int a;
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter amount of doors: ");
            a = scan.nextInt();
            for (int i = 0; i < a; i++) doors.add(new Door());
        }
    }
    public class Door
    {
        public void openTheDoor()
        {
            System.out.println("Doors are opened!");
        }
    }

    ArrayList<Door> doors = new ArrayList<>();
    ArrayList<Window> windows = new ArrayList<>();
    ArrayList<Room> rooms = new ArrayList<>();
    ArrayList<Kitchen> kitchens = new ArrayList<>();
    ArrayList<Bathroom> bathrooms = new ArrayList<>();


    public House() {
        this.doors = doors;
        this.windows = windows;
        this.rooms = rooms;
        this.kitchens = kitchens;
        this.bathrooms = bathrooms;
    }

    public void fillTheHouse()
    {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter amount of windows: ");
        a = scan.nextInt();
        for (int i = 0; i < a; i++) windows.add(new Window());
        System.out.print("Enter amount of rooms: ");
        a = scan.nextInt();
        for (int i = 0; i < a; i++) {
            rooms.add(new Room());
            rooms.get(i).fillTheRoom();
        }
        System.out.print("Enter amount of kitchens: ");
        a = scan.nextInt();
        for (int i = 0; i < a; i++) {
            kitchens.add(new Kitchen());
            kitchens.get(i).fillTheKitchen();
        }
        System.out.print("Enter amount of bathrooms: ");
        a = scan.nextInt();
        for (int i = 0; i < a; i++) {
            bathrooms.add(new Bathroom());
            bathrooms.get(i).fillTheBathroom();
        }
    }
    public String toString()
    {
        return ("This house contains: \n - "+doors.size()+" door/s \n - "+windows.size()+" window/s \n - "
                +windows.size()+" room/s \n - "+kitchens.size()+" kitchen/s \n - "
                +bathrooms.size()+" bathroom/s");
    }
    public void openAllDoors()
    {
        for (int i = 0; i < doors.size(); i++) {
            doors.get(i).openTheDoor();
        }
    }

}
