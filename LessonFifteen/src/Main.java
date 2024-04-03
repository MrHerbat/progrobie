import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wolisz psa czy kota? PIES/KOT:");
        String nazwa = scan.nextLine();
        switch (nazwa)
        {
            case "pies":
                System.out.println(Animal.DOG.toString());
                break;
            case "kot":
                System.out.println(Animal.CAT.toString());
                break;
            default:
                System.out.println("Nie ma takiej opcji!");
                break;
        }
    }
}