public class Trojkat extends Figura
{
    double podstawa;
    double ramie1;
    double ramie2;

    public Trojkat(double podstawa, double ramie1, double ramie2)
    {
        this.podstawa = podstawa;
        this.ramie1 = ramie1;
        this.ramie2 = ramie2;
    }
    public Trojkat(double podstawa)
    {
        this.podstawa = podstawa;
        this.ramie1 = podstawa;
        this.ramie2 = podstawa;
    }



    @Override
    void obliczPole() {
        super.obliczPole();
        double p =(podstawa+ramie1+ramie2)/2;
        System.out.println(Math.sqrt((p*(p-podstawa)*(p-ramie2)*(p-ramie1))));
    }


    @Override
    void obliczObwod() {
        super.obliczObwod();
        System.out.println(podstawa+ramie1+ramie2);
    }
}
