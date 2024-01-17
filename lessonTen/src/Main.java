import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dla której fiugry probujesz obliczyć obwód i pole: \n 1 - Kwadrat \n 2 - Trójkąt \n 3 - Koło");
        int wybor = scanner.nextInt();
        switch (wybor)
        {
            case 1:
                System.out.print("Podaj wysokość: ");
                double a = scanner.nextDouble();
                Figura figura1 = new Kwadrat(a);
                figura1.obliczObwod();
                figura1.obliczPole();
                break;
            case 2:
                System.out.print("Podaj podstawe: ");
                a = scanner.nextDouble();
                System.out.print("Podaj 2 ramie: ");
                double b = scanner.nextDouble();
                System.out.print("Podaj 1 ramie: ");
                double c = scanner.nextDouble();
                Figura figura2 = new Trójkąt(a,c,b);
                figura2.obliczObwod();
                figura2.obliczPole();
                break;
            case 3:
                System.out.print("Podaj promien: ");
                a = scanner.nextDouble();
                Figura figura3 = new Koło(a);
                figura3.obliczObwod();
                figura3.obliczPole();
                break;


        }



    }
}