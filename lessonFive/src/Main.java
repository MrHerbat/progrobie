import owady.Beetle;
import pojazdy.Car;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {



        Scanner scan = new Scanner(System.in);
        Car myCar = new Car();
//        myCar.raceway();


        System.out.print("How many turns there are?: ");
        int turnsAmount = scan.nextInt();
        int i = turnsAmount;
        int[] b = new int[i];
        int[] a = new int[i];
        String[] turn = new String[i];
        for(i = 0; i<turnsAmount;i++)
        {
            System.out.print("What is the distance until the turn?(meters): ");
            a[i] = scan.nextInt();
            System.out.print("In which direction car needs to turn?(left/right): ");
            turn[i] = scan.next();
            System.out.print("How sharp is next turn?: ");
            b[i] = scan.nextInt();
        }
        for(i = 0; i<turnsAmount;i++)
        {
            myCar.forward(a[i]);
            if(turn[i] == "left")
            {
                myCar.turnLeft(b[i]);
            }
            else
            {
                myCar.turnRight(b[i]);
            }
        }


//        Beetle smallBeetles = new Beetle();

//        System.out.print("Podaj swoje imię: ");
//        String name = scan.nextLine();
//        System.out.println("twoje imię to "+name);
//        System.out.print("Enter firts number: ");
//        int a = scan.nextInt();
//        System.out.print("Enter second number: ");
//        int b = scan.nextInt();
//        int sum = a+b;
//        System.out.println(a+" + "+b+" = "+sum);

//        System.out.print("Enter firstname: ");
//        String firstname = scan.nextLine();
//        System.out.print("Enter lastname: ");
//        String lastname = scan.nextLine();
//        System.out.print("Enter any char: ");
//        char character = scan.nextLine().charAt(0);
//        System.out.print("Enter any boolean: ");
//        boolean tf = scan.nextBoolean();
//        System.out.print("Enter any number: ");
//        int a = scan.nextInt();
//        System.out.print("Enter any decimal number(comma, not dot): ");
//        double db = scan.nextDouble();
//        System.out.print("Enter any word: ");
//        String word = scan.nextLine();
//        if(firstname != "" && lastname != "")
//        {
//            class Human
//            {
//                String[] name = {firstname,lastname};
//            }
//            Human human = new Human();
//            System.out.println(human.name[0] + " " + human.name[1]);
//        }
//        else
//        {
//            System.out.println("You didn't put firstname or lastname!");
//        }
    }

}
