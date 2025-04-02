public class Trójkąt extends Figura
{
    double podstawa;
    double ramie1;
    double ramie2;

    public Trójkąt(double podstawa, double ramie1, double ramie2) {
        this.podstawa = podstawa;
        this.ramie1 = ramie1;
        this.ramie2 = ramie2;
    }

    @Override
    void obliczPole() {
        super.obliczPole();
        double p = (podstawa+ramie1+ramie2)/2;
        System.out.println(Math.sqrt((p*(p-podstawa)*(p-ramie2)*(p-ramie1))));
    }

    @Override
    void obliczObwod() {
        super.obliczObwod();
        System.out.println(podstawa+ramie1+ramie2);
    }
}
