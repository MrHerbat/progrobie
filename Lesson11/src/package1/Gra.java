package package1;

public class Gra
{
    {
        Pojazd pojazd = new Pojazd();
        System.out.println("==================");
//        System.out.println(pojazd.owner);         //private niedziała w innych klasach
        System.out.println(pojazd.value);           //pole z modyfikatorem public działa wszędzie
        System.out.println(pojazd.maximalSpeed);    //pole z modyfikatorem protected działa w tym samym pakiecie w którym był utworzony
        System.out.println(pojazd.isElectric);      //pole bez modyfikatora działa w tym samym pakiecie w którym był utworzony

    }
}
