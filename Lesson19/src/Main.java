import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruitBasket = new ArrayList<>();
        fruitBasket.add("Apple");
        fruitBasket.add("Banana");
        fruitBasket.add("Orange");
        fruitBasket.add("Grape");
        fruitBasket.add("Tomato");
        fruitBasket.add("Pineapple");

        Iterator<String> fruitIterator = fruitBasket.iterator();
        System.out.println(fruitBasket);
        for (String fruit : fruitBasket) {
            String f = fruitIterator.next();
            if (fruit.equals("Tomato")) {
                fruitIterator.remove();
            }
        }
        System.out.println(fruitBasket);


        ArrayList<String> uczniowie = new ArrayList<>();
        uczniowie.add("Leśniak");
        uczniowie.add("Sulewski");
        uczniowie.add("Bulanda");
        uczniowie.add("Suchan");
        uczniowie.add("Sanowski");
        uczniowie.add("Sławiński");
        uczniowie.add("Rosiek");
        uczniowie.add("Machnik");
        uczniowie.add("Mirecki");
        uczniowie.add("Owsiński");
        uczniowie.add("Sikora");
        uczniowie.add("Machinko");
        uczniowie.add("Mastaj");
        uczniowie.add("Pielak");
        uczniowie.add("Sańka");

        System.out.println(uczniowie);

        Collections.sort(uczniowie);

        System.out.println(uczniowie);

        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();

        int temp = 0;
        for(int i = 0;i<10;i++)
        {
            number1.add(i);
        }

        for (int i = 0; i < 10; i++) {
            temp = (int)(Math.random()*(10));
            number2.add(temp);
        }

        System.out.println(number1);
        System.out.println(number2);
        number1.retainAll(number2);
        Collections.sort(number1);
        System.out.println(number1);

    }
}