import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
//        int wiek = 16;
//        System.out.println(~wiek);
//        System.out.println(3123123%47);
//        int szyfr = 6;
//        szyfr = szyfr << 4;
//        szyfr = szyfr >> 2;
//        szyfr = szyfr << 7 ;
//        szyfr = szyfr << 2;
//        szyfr = szyfr >> 10;
//        System.out.println(szyfr);



//        int x,y,z,p;
//        x = 192 & 255;
//        y = 168 & 255;
//        z = 57 & 252;
//        p = 2 & 0;
//        System.out.println(x+"."+y+"."+z+"."+p);

//
        Trojkat trojkat = new Trojkat();
//        trojkat.budowaTrojkat();
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj swoje imię: ");
        String name = scan.next();
        System.out.print("Podaj swój wiek: ");
        int age = scan.nextInt();
        System.out.print("Podaj swoją płeć(k/m): ");
        String g = scan.next();
        String gender = g.toLowerCase();
        Human human = new Human(name,age,gender);
        human.emerytura(human.name,human.age,human.gender);


//        double x;
//        double y;
//        System.out.print("Podaj pierwszą liczbę: ");
//        int a = scan.nextInt();
//        System.out.print("Podaj drugą liczbę: ");
//        int b = scan.nextInt();
//        System.out.print("Podaj trzecią liczbę: ");
//        int c = scan.nextInt();
//        double delta = (b*b)-4*a*c;
//        if(delta > 0)
//        {
//            x = (-b-Math.sqrt(delta))/(2*a);
//            y = (-b+Math.sqrt(delta))/(2*a);
//            System.out.println("delta ma 2 miejsca zerowe i są to: "+x+" i "+y);
//        }else if(delta == 0)
//        {
//            x = -b/(2*a);
//            System.out.println("delta ma 1 miejsca zerowe i jest to: "+x);
//        } else
//        {
//            System.out.println("delta nie ma miejsc zerowych");
//        }



//        if(a<0)
//        {
//            System.out.println("ma być DODATNIA!");
//        }
//        else if(a>=0 && a<=10)
//        {
//            System.out.println("liczba należy do 1. dziesiątki liczby");
//        } else if(a>=11 && a<=20)
//        {
//            System.out.println("liczba należy do 2. dziesiątki liczby");
//        }else if(a>=21 && a<=30)
//        {
//            System.out.println("liczba należy do 3. dziesiątki liczby");
//        }else if(a>=31 && a<=40)
//        {
//            System.out.println("liczba należy do 4. dziesiątki liczby");
//        }else if(a>=41 && a<=50)
//        {
//            System.out.println("liczba należy do 5. dziesiątki liczby");
//        }else if(a>=51 && a<=60)
//        {
//            System.out.println("liczba należy do 6. dziesiątki liczby");
//        }else if(a>=61 && a<=70)
//        {
//            System.out.println("liczba należy do 7. dziesiątki liczby");
//        }else if(a>=71 && a<=80)
//        {
//            System.out.println("liczba należy do 8. dziesiątki liczby");
//        }else if(a>=81 && a<=90)
//        {
//            System.out.println("liczba należy do 9. dziesiątki liczby");
//        }else
//        {
//            System.out.println("liczba należy do 10. dziesiątki liczby");
//        }


    }
}