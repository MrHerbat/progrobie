package package2;

import package1.Pojazd;

public class Lotnisko
{
    {
        Pojazd pojazd = new Pojazd();
        System.out.println("==================");
//        System.out.println(pojazd.owner);         //private niedziała w innych klasach
        System.out.println(pojazd.value);           //pole z modyfikatorem public działa wszędzie
//        System.out.println(pojazd.maxSpeed);      //pole z modyfikatorem protected działa w innych pakiet tylko wtedy, gdy dana klasa dziedziczy
//        System.out.println(pojazd.isElectric);    //pole bez modyfikatora działa w tym samym pakiecie w którym był utworzony

    }
}
