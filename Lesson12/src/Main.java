import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);


        Skyscraper skyscraper = new Skyscraper();
        System.out.print("Podaj wysokość wieżowca w metrach: ");
        double a = scan.nextDouble();
        skyscraper.setHeight(a);
        System.out.print("Podaj powierzchnie parteru wieżowca w metrach: ");
        a = scan.nextDouble();
        skyscraper.setGroundFloorArea(a);
        System.out.print("Podaj ilość pięter wieżowca: ");
        int b = scan.nextInt();
        skyscraper.setNumberOfFloors(b);
        System.out.print("Podaj rok budowy: ");
        b = scan.nextInt();
        skyscraper.setConstructionYear(b);
        System.out.print("Podaj nazwisko architekta: ");
        String n = scan.nextLine();
        skyscraper.setArchitectName(n);
        System.out.print("Czy ma windę? ");
        boolean tf = scan.nextBoolean();
        skyscraper.setHasElevator(tf);
        System.out.print("Czy ma taras widokowy? ");
        tf = scan.nextBoolean();
        skyscraper.setHasObservationDeck(tf);
        System.out.print("Czy jest mieszkalny? ");
        tf = scan.nextBoolean();
        skyscraper.setResidential(tf);
        System.out.println("Ilość pięter: "+skyscraper.getNumberOfFloors());
        System.out.println("Wysokość w metrach: "+skyscraper.getHeight());
        System.out.println(skyscraper.getGroundFloorArea());
        System.out.println(skyscraper.getArchitectName());
        System.out.println(skyscraper.getConstructionYear());
        System.out.println(skyscraper.isHasElevator());
        System.out.println(skyscraper.isHasObservationDeck());
        System.out.println(skyscraper.isResidential());
    }
}