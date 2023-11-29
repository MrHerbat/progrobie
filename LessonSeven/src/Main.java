public class Main {

    public static void addOneToTable(int[] table)
    {
        for (int i = 0; i < table.length; i++)
        {
            table[i] = table[i]+1;
        }
    }
    public static void addOneToNumber(int number)
    {
        number++;
    }
    public static int howManyLetters(String[] table)
    {
        int amountOfLetters = 0;
        for (int i = 0; i < table.length; i++)
        {
            amountOfLetters += table[i].length();
        }
        return amountOfLetters;
    }

    public static void sortNumberTable(int[] table)
    {
        for (int i = 1; i < table.length; i++)
        {
            int j = i;
            int a = table[i];
            while ((j > 0) && (table[j-1] > a))   //returns true when both conditions are true
            {
                table[j] = table[j-1];
                j--;
            }
            table[j] = a;
        }
    }

    public static void main(String[] args)
    {
        int[] someNumbers = new int[10];
        for (int i = 0; i < someNumbers.length; i++)
        {
            someNumbers[i] = i;
        }
        for (int numbers: someNumbers)
        {
            System.out.println(numbers);
        }
        addOneToTable(someNumbers);

        for (int numbers:someNumbers)
        {
            System.out.println(numbers);
        }
        int number = 7;
        System.out.println(number);
        addOneToNumber(number);
        System.out.println(number);

        int[] otherNumbers = someNumbers;
        System.out.println(otherNumbers);
        System.out.println(someNumbers);



        int letters = 0;
        String[] lastNames = new String[5];
        lastNames[0] = "White";
        lastNames[1] = "Winters";
        lastNames[2] = "Kowalski";
        lastNames[3] = "Johnson";
        lastNames[4] = "Davis";

        System.out.println(howManyLetters(lastNames));

        int[] tableOfNumbers = {36,67,57,33,23,78};
        for (int numbers:tableOfNumbers)
        {
            System.out.print(numbers+" | ");
        }
        System.out.println();
        sortNumberTable(tableOfNumbers);
        for (int numbers:tableOfNumbers)
        {
            System.out.print(numbers+" | ");
        }


        int[][] totolotek = new int[5][6];
        totolotek[0][0] = 12;
        totolotek[0][1] = 21;
        totolotek[0][2] = 26;
        totolotek[0][3] = 40;
        totolotek[0][4] = 44;
        totolotek[0][5] = 47;

        totolotek[1][0] = 9;
        totolotek[1][1] = 15;
        totolotek[1][2] = 25;
        totolotek[1][3] = 28;
        totolotek[1][4] = 38;
        totolotek[1][5] = 44;

        totolotek[2][0] = 3;
        totolotek[2][1] = 4;
        totolotek[2][2] = 14;
        totolotek[2][3] = 28;
        totolotek[2][4] = 31;
        totolotek[2][5] = 42;

        totolotek[3][0] = 2;
        totolotek[3][1] = 17;
        totolotek[3][2] = 32;
        totolotek[3][3] = 39;
        totolotek[3][4] = 47;
        totolotek[3][5] = 49;

        totolotek[4][0] = 14;
        totolotek[4][1] = 20;
        totolotek[4][2] = 26;
        totolotek[4][3] = 34;
        totolotek[4][4] = 38;
        totolotek[4][5] = 46;
        System.out.println();
        for (int i = 0; i < totolotek.length; i++)
        {
            System.out.print((i+1)+". losowanie: ");
            for (int j = 0; j < totolotek[i].length; j++)
            {
                System.out.print("("+totolotek[i][j]+") ");
            }
            System.out.println();
        }
        System.out.println();

        Znaczek[] klaser = new Znaczek[256];
        for (int i = 0; i < (klaser.length/2); i++)
        {
            klaser[i] = new Znaczek(i);
        }
        System.out.println(klaser[127].numerZnaczka+" "+klaser[20].krajPochodzenia);


    }
}