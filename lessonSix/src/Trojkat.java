import java.util.Scanner;

public class Trojkat
{
    double a,b,c;

    public Trojkat() {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void budowaTrojkat()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj długość pierwszego boku trójkąta: ");
        a = scan.nextDouble();
        System.out.print("Podaj długość drugiego boku trójkąta: ");
        b = scan.nextDouble();
        System.out.print("Podaj długość trzeciego boku trójkąta: ");
        c = scan.nextDouble();
        if(a <= 0 || b <= 0 || c <= 0)
        {
            System.out.println("Długości nie mogą być ujemne lub zerowe!");
        }
        else if(a+b>c && b+c>a && a+c>b)
        {
            System.out.println("Można z podanych długości stworzyć trójkąt!");
        }
        else
        {
            System.out.println("Coś jest nie tak, albo nie można zbudować z podanych długości trójkątu");
        }
    }
}
