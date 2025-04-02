import java.util.Scanner;

/**
 * Klasa Main
 */
public class Main {
    /**
     * podstawowy konstruktor klasy Main (mnie nie pytajcie)
     */
    public Main() {
    }

    /**
     * Funkcja wywołująca program w konsoli czy coś
     * @param args nie wiem
     */
    public static void main(String[] args) {
//        House dom1 = new House();
//        dom1.fillTheHouse();
//        System.out.println(dom1.toString());
//        for (int i = 0; i < dom1.kitchens.size(); i++) {
//           dom1.kitchens.get(i).openAllDoors();
//        }
//        for (int i = 0; i < dom1.bathrooms.size(); i++) {
//            dom1.bathrooms.get(i).openAllDoors();
//        }
//        for (int i = 0; i < dom1.rooms.size(); i++) {
//            dom1.rooms.get(i).openAllDoors();
//        }

//        House dom2 = new House();
//        dom2.fillTheHouse();
//        System.out.println(dom2.toString());
//        for (int i = 0; i < dom2.kitchens.size(); i++) {
//            dom2.kitchens.get(i).openAllDoors();
//        }
//        for (int i = 0; i < dom2.bathrooms.size(); i++) {
//            dom2.bathrooms.get(i).openAllDoors();
//        }
//        for (int i = 0; i < dom2.rooms.size(); i++) {
//            dom2.rooms.get(i).openAllDoors();
//        }
        House mojDom = new House();
        mojDom.fillTheHouse();
        mojDom.autoConnectRooms();
        System.out.println(mojDom.toString());

    }
}