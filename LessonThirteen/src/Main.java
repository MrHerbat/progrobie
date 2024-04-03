import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean czyWygrano = false;

//        int[] wygranyKupon = new int[10];
//        int[][] temp = new int[3][10];
//        for (int i = 0; i < wygranyKupon.length; i++)
//        {
//            wygranyKupon[i] = (int)(Math.random()*6)+1;
//        }
//
//        KuponTotolotka[] kupon = new KuponTotolotka[3];
//        for (int i = 0; i < 3; i++)
//        {
//            System.out.print("Podaj 10 liczb w zakresie 1-6 dla kuponu numer "+(i+1)+": ");
//            for (int j = 0; j < temp[i].length; j++)
//            {
//               temp[i][j] = scanner.nextInt();
//            }
//            kupon[i] = new KuponTotolotka(temp[i]);
//            System.out.println();
//        }
//
//        System.out.print("Liczby wygranego kuponu: ");
//        for (int i = 0; i < wygranyKupon.length; i++)
//        {
//            System.out.print(wygranyKupon[i]+" ");
//        }
//        System.out.println();
//        for (int i = 0; i < 3; i++)
//        {
//            System.out.print("Liczby kuponu "+(i+1)+": ");
//            for (int j = 0; j < kupon[i].numbers.length; j++)
//            {
//                System.out.print(kupon[i].numbers[j]+" ");
//            }
//            System.out.println();
//            if(Arrays.equals(kupon[i].numbers, wygranyKupon))
//            {
//                System.out.println("Kupon"+(i+1)+" wygrał!");
//                czyWygrano = true;
//            }
//        }
//        if(!czyWygrano)
//        {
//            System.out.println("Żaden twój kupon nie wygrał, powodzenia kiedyś!");
//        }

        int[] minilottoWygrane = new int[5];
        int[] temp1 = new int[5];

        for (int i = 0; i < minilottoWygrane.length; i++)
        {
            if(i==0)
            {
                minilottoWygrane[i] = (int)(Math.random()*42)+1;
            } else {
                do {
                    minilottoWygrane[i] = (int) (Math.random() * 42) + 1;
                } while (minilottoWygrane[i] == minilottoWygrane[i - 1]);
            }
        }
        System.out.print("Podaj 5 różnych liczb z zakresu 1-42:");
        for (int i = 0; i < temp1.length; i++)
        {
            temp1[i] = scanner.nextInt();
        }
        System.out.print("Zwycięskie numery to: ");
        for (int i = 0; i < minilottoWygrane.length; i++) {
            System.out.print(minilottoWygrane[i]+" "); 
        }
        System.out.println();
        Minilotto minilotto = new Minilotto(temp1);
        if(Arrays.equals(minilottoWygrane,minilotto.numery))
        {
            System.out.println("Brawo, wygrałeś!");
        } else{
            System.out.println("Niestety się nie udało, powodzenia następnym razem!");
        }


    }
}