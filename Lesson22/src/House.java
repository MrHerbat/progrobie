import java.util.ArrayList;
import java.util.Scanner;

/**
 * Główna klasa dla domu
 */
public class House {
    /**
     * klasa Door, odpowiadająca za łączenie pokoi drzwiami i ogólne posiadanie przez pokój drzwi
     */
    public class Door {
        /**
         * connectedRoom1 - pierwszy pokój łączący się drzwiami z drugim
         */
        Room connectedRoom1;
        /**
         * connectedRoom2 - drugi pokój łączący się drzwiami z pierwszym
         */
        Room connectedRoom2;

        /**
         * prosty konstruktor jednoargumentowy dla drzwi
         * @param connectedRoom1 pierwszy połączony pokój
         */
        public Door(Room connectedRoom1) {
            this.connectedRoom1 = connectedRoom1;
        }

        /**
         * funkcja odpowiadająca za otwarcie drzwi między dwoma pokojami
         */
        public void openTheDoor() {
            System.out.println("Door has been opened between " + connectedRoom1.getClass().getSimpleName() + " and " + connectedRoom2.getClass().getSimpleName());
        }

        /**
         * funkcja odpowiadająca za łączenie pomieszczenia cRoom z pierwszym pomieszczeniem (connectedRoom1)
         * @param cRoom pokój do połączenia
         */
        public void connectTwoRooms(Room cRoom) {
            if (cRoom != null) {
                connectedRoom2 = cRoom;  // Connect the door to the other room
                System.out.println("Door now connects " + connectedRoom1.getClass().getSimpleName() + " and " + connectedRoom2.getClass().getSimpleName());
            }
        }

        /**
         * funkcja zwracająca pomieszczenia jakie łączą drzwi
         */
        public void whatDoesItConnect() {
            System.out.println("This door connects " + connectedRoom1.getClass().getSimpleName() + " and " + connectedRoom2.getClass().getSimpleName());
        }
    }

    /**
     * Klasa Room odpowiedzialna za bycie podstawą pod bardziej rozbudowa klasy pomieszczeń lub bycie zwykłym pomieszczeniem
     */
    public class Room {
        /**
         * Lista przechowująca obiekty klasy Door
         */
        ArrayList<Door> doors = new ArrayList<>();
        /**
         * Liczba drzwi, która jeszcze nie została połączona z innym pokojem
         */
        int freeDoors;
        /**
         * podstawowy konstruktor klasy Room
         */
        public Room() {
        }

        /**
         * Funckja wypełniająca klasę Room drzwiami
         */
        public void fillTheRoom() {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter amount of doors for this room: ");
            freeDoors = scan.nextInt();
            for (int i = 0; i < freeDoors; i++) {
                doors.add(new Door(this));  // Add doors to the room
            }
        }

        /**
         * Funkcja otwierająca wszystkie drzwi w pomieszczeniu
         */
        public void openAllDoors() {
            for (Door door : doors) {
                door.openTheDoor();
            }
            System.out.println("All doors in this room have been opened");
        }
    }

    /**
     * Klasa Kitchen dziedziczy po klasie Room
     */
    public class Kitchen extends Room {
        /**
         * podstawowy konstruktor klasy Kitchen
         */
        public Kitchen() {
        }
    }

    /**
     * Klasa Bathroom dziedziczy po klasie Room i jest tej klasy bardziej rozbudowaną wersją
     */
    public class Bathroom extends Room
    {
        /**
         * klasa Shower
         */
        public class Shower
        {
            /**
             * podstawowy konstruktor klasy Shower
             */
            public Shower() {
            }
        }

        /**
         * klasa Bathtub
         */
        public class Bathtub
        {
            /**
             * podstawowy konstruktor klasy Bathtub
             */
            public Bathtub() {
            }
        }

        /**
         * klasa Sink
         */
        public class Sink
        {
            /**
             * podstawowy konstruktor klasy Sink
             */
            public Sink() {
            }
        }

        /**
         * klasa Washer
         */
        public class Washer
        {
            /**
             * podstawowy konstruktor klasy Washer
             */
            public Washer() {
            }
        }

        /**
         * klasa Cabinet
         */
        public class Cabinet
        {
            /**
             * podstawowy konstruktor klasy Cabinet
             */
            public Cabinet() {
            }
        }

        /**
         * lista przechowująca obiekty klasy Shower
         */
        ArrayList<Shower> showers = new ArrayList<>();
        /**
         * lista przechowująca obiekty klasy Bathtub
         */
        ArrayList<Bathtub> bathtubs = new ArrayList<>();
        /**
         * lista przechowująca obiekty klasy Sink
         */
        ArrayList<Sink> sinks = new ArrayList<>();
        /**
         * lista przechowująca obiekty klasy Washer
         */
        ArrayList<Washer> washers = new ArrayList<>();
        /**
         * lista przechowująca obiekty klasy Cabinet
         */
        ArrayList<Cabinet> cabinets = new ArrayList<>();

        /**
         * podstawowy konstruktor klasy Bathroom
         */
        public Bathroom() {
            this.showers = showers;
            this.bathtubs = bathtubs;
            this.sinks = sinks;
            this.washers = washers;
            this.cabinets = cabinets;
        }

        /**
         * funckja opdowiedzialna za wypełnienie wszystkich list z klasy Bathroom odpowiadającymi jej obiektami klas
         */
        public void fillTheBathroom()
        {
            int a;
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter amount of doors: ");
            a = scan.nextInt();
            freeDoors = a;
            for (int i = 0; i < a; i++) doors.add(new Door(this));
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

    /**
     * Klasa Window, nie dziedziczy i nie jest parentem
     */
    public class Window {
        /**
         * podstawowy konstruktor klasy Window
         */
        public Window() {
        }
    }
    /**
     * lista przechowująca obiekty klasy Room i tą klasę dziedziczące, np. Kitchen i Bathroom
     */
    ArrayList<Room> allRooms = new ArrayList<>();
    /**
     * lista przechowująca obiekty klasy Window
     */
    ArrayList<Window> windows = new ArrayList<>();
    /**
     * lista przechowująca obiekty klasy Shower
     */
    ArrayList<Room> rooms = new ArrayList<>();
    /**
     * lista przechowująca obiekty klasy Kitchen
     */
    ArrayList<Kitchen> kitchens = new ArrayList<>();
    /**
     * lista przechowująca obiekty klasy Bathroom
     */
    ArrayList<Bathroom> bathrooms = new ArrayList<>();


    /**
     * pusty konstruktor klasu House
     */
    public House() {
    }

    /**
     * funckja opdowiedzialna za wypełnienie wszystkich list z klasy House odpowiadającymi jej obiektami klas oraz zsumowanie wszyskithc pomieszczeń w liście allRooms
     */
    public void fillTheHouse() {
        int roomNumber, kitchenNumber, bathroomNumber, x;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter amount of windows: ");
        x = scan.nextInt();
        for (int i = 0; i < x; i++) windows.add(new Window());

        System.out.print("Enter amount of rooms: ");
        roomNumber = scan.nextInt();
        for (int i = 0; i < roomNumber; i++) rooms.add(new Room());

        System.out.print("Enter amount of kitchens: ");
        kitchenNumber = scan.nextInt();
        for (int i = 0; i < kitchenNumber; i++) kitchens.add(new Kitchen());

        System.out.print("Enter amount of bathrooms: ");
        bathroomNumber = scan.nextInt();
        for (int i = 0; i < bathroomNumber; i++) bathrooms.add(new Bathroom());

        for (Room room : rooms) room.fillTheRoom();
        for (Kitchen kitchen : kitchens) kitchen.fillTheRoom();
        for (Bathroom bathroom : bathrooms) bathroom.fillTheBathroom();

        allRooms.addAll(rooms);
        allRooms.addAll(bathrooms);
        allRooms.addAll(kitchens);
    }


    /**
     * funkcja odpowiadająca za połączenie dwóch pomieszczeń ze sobą przy pomocy klasy Door
     * @param room1 pierwsze pomieszczenie do połączenia
     * @param room2 drugie pomieszczenie do połączenia
     */
    public void connectRooms(Room room1, Room room2) {
        if (room1.freeDoors > 0 && room2.freeDoors > 0) {
            Door door1 = room1.doors.get(0);
            Door door2 = room2.doors.get(0);

            door1.connectTwoRooms(room2);
            door2.connectTwoRooms(room1);

            room1.freeDoors--;
            room2.freeDoors--;

            System.out.println("Rooms successfully connected via doors.");
        } else {
            System.out.println("One or both rooms do not have enough free doors to connect.");
        }
    }

    /**
     * funkcja będąca zautomatyzowaną wersją łączenia pomieszczeń z funckji connectRooms w klasie House
     */
    public void autoConnectRooms() {
        for (int i = 0; i < allRooms.size(); i++) {
            Room room1 = allRooms.get(0);
            Room room2 = allRooms.get(i);

            connectRooms(room1, room2);
        }
    }

    /**
     * funkcja zwracająca String z wielkością wszystkich list w klasie House
     * @return number of all rooms and windows
     */
    public String toString() {
        return ("This house contains: \n - " + windows.size() + " window(s) \n - "
                + rooms.size() + " room(s) \n - " + kitchens.size() + " kitchen(s) \n - "
                + bathrooms.size() + " bathroom(s)");
    }
}