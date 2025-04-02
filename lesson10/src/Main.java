import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {



        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj dla której fiugry probujesz obliczyć obwód i pole: \n 1 - Kwadrat \n 2 - Trójkąt \n 3 - Koło");
//        int wybor = scanner.nextInt();
//        Figura[] zbiorMoichFigur = new Figura[3];
//
//        System.out.print("Podaj a: ");
//        double a = scanner.nextDouble();
//        System.out.print("Podaj b: ");
//        double b = scanner.nextDouble();
//        System.out.print("Podaj c: ");
//        double c = scanner.nextDouble();
//
//        zbiorMoichFigur[0] = new Kwadrat(a);
//        zbiorMoichFigur[1] = new Trojkat(a);
//        zbiorMoichFigur[2] = new Kolo(a);
//        for (Figura figura: zbiorMoichFigur)
//        {
//            figura.obliczPole();
//            figura.obliczObwod();
//        }
//        switch (wybor)
//        {
//            case 1:
//                System.out.print("Podaj wysokość: ");
//                double a = scanner.nextDouble();
//                Figura figura1 = new Kwadrat(a);
//                figura1.obliczObwod();
//                figura1.obliczPole();
//                break;
//            case 2:
//                System.out.print("Podaj podstawe: ");
//                a = scanner.nextDouble();
//                System.out.print("Podaj 2 ramie: ");
//                double b = scanner.nextDouble();
//                System.out.print("Podaj 1 ramie: ");
//                double c = scanner.nextDouble();
//                Figura figura2 = new Trójkąt(a,c,b);
//                figura2.obliczObwod();
//                figura2.obliczPole();
//                break;
//            case 3:
//                System.out.print("Podaj promien: ");
//                a = scanner.nextDouble();
//                Figura figura3 = new Koło(a);
//                figura3.obliczObwod();
//                figura3.obliczPole();
//                break;
//            default:
//                System.out.println("Nie ma takiego wyboru.");
//                break;
//        }

        Komputer komputer = new Komputer("Intel i6-11400f",16,"NVidia GTX-1090Ti");
        Pc pc = new Pc("AMD Ryzen 5 5600",8,"Radeon R6 6600",6);
        Telefon telefon = new Telefon("Apple A15 Bionic - 1740 / 4800", 8, "Apple Graphics 2023", true);
        Laptop laptop = new Laptop("Intel i5-9400f",8,"NVidia GTX-1090",true);
        komputer.wypiszDane();
        pc.wypiszDane();
        telefon.wypiszDane();
        laptop.wypiszDane();





    }
}