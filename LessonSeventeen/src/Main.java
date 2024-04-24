public class Main {
    public static void main(String[] args)
    {
        AKERMANEC200 koparka1 = new AKERMANEC200();

        koparka1.uruchom();
        double maxGlebokosc, obecnaGlebokosc,ileZiemi,oIle;
        maxGlebokosc = 5;
        obecnaGlebokosc = 0;
        ileZiemi = 1;
        oIle = 1.5;
        while(obecnaGlebokosc<maxGlebokosc)
        {
            koparka1.opuszczonoLyzke(oIle);
            koparka1.kop(ileZiemi);

        }
    }
}