public class Main {
    public static void addOneToArray(int[] x)
    {
        for (int i = 0; i < x.length; i++)
        {
            x[i] +=1;
        }
    }
    public static void addOne(int x)
    {
        x=x+1;
    }
    public static void main(String[] args)
    {
//        String[] students = new String[14];
//        students[0] = "Maciek";
//        students[1] = "Igor";
//        students[2] = "Patryk";
//        students[3] = "Maciek";
//        students[4] = "Michał";
//        students[5] = "Bartek";
//        students[6] = "Patryk";
//        students[7] = "Kamil";
//        students[8] = "Kacper";
//        students[9] = "Dawid";
//        students[10] = "Olek";
//        students[11] = "Karol";
//        students[12] = "Maciek";
//        students[13] = "Hubert";
//        for (int i = 0; i < students.length; i++) {
//            System.out.println("Student name: "+students[i]);
//        }
//        System.out.println("\n\n");
//        for (String studentName: students)
//        {
//            System.out.println("Student name: "+studentName);
//        }

//        double[] math = new double[4];
//        String[] constantName = {"Pi", "Euller's number", "Gamma", "Phi"};
//        math[0] = 3.141592535897932d;
//        math[1] = 2.718281825904523d;
//        math[2] = 0.577215664901532d;
//        math[3] = 1.618033988749894d;
//        int i = 0;
//
//        for (double constant:math)
//        {
//            System.out.println(constantName[i]+": "+constant);
//            i++;
//        }

        int[] someNumbers = new int[10];
        for (int i = 0; i < someNumbers.length; i++)
        {
            someNumbers[i] = i;
        }
        for (int number:someNumbers)
        {
            System.out.println(number);
        }
        addOneToArray(someNumbers);
        for (int number:someNumbers)
        {
            System.out.println(number);
        }

        int singleNumber = 7;
        System.out.println(singleNumber);
        addOne(singleNumber);
        System.out.println(singleNumber);

        int[] otherNumbers = new int[10];
        otherNumbers=someNumbers;

        addOneToArray(otherNumbers);

        for (int number:otherNumbers)
        {
            System.out.println(number);
        }

        System.out.println(otherNumbers);
        System.out.println(someNumbers);
    }

}