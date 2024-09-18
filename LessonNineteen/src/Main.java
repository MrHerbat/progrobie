import java.util.ArrayList;
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
    }
}