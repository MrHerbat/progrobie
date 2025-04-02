package package2;

import package1.Pojazd;

public class Samolot extends Pojazd
{
    {
        this.maximalSpeed = 423.5;
        this.value = 1500000;
        System.out.println("==================");
        //System.out.println(samolot.owner)                 //private niedziała w innych klasach
        System.out.println("Cena samolotu:"+this.value);        //pole z modyfikatorem public działa wszędzie
        System.out.println("Maksymalna prędkość samolotu:"+this.maximalSpeed);           //pole z modyfikatorem protected działa w innych pakiet tylko wtedy, gdy dana klasa dziedziczy
        //System.out.println(samolot.isElectric);           //pole bez modyfikatora nie działa w innych paketach
    }
}
