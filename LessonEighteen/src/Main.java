import java.lang.reflect.Array;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person tank1member1 = new Person("Thomas","Commander");
        Person tank1member2 = new Person("Jason","Driver");
        Person tank1member3 = new Person("Mike","Loader");
        Person tank1member4 = new Person("Jozef","Loader");

        Person tank2member1 = new Person("Hans","Commander");
        Person tank2member2 = new Person("Eric","Driver");
        Person tank2member3 = new Person("Lucas","Loader");
        Person tank2member4 = new Person("Jozef","Loader");

        Person tank3member1 = new Person("Iosif","Commander");
        Person tank3member2 = new Person("Walentin","Driver");
        Person tank3member3 = new Person("Nazar","Loader");
        Person tank3member4 = new Person("Jozef","Loader");

        Person tank4member1 = new Person("Adam","Commander");
        Person tank4member2 = new Person("Tomasz","Driver");
        Person tank4member3 = new Person("Jozef","Loader");
        Person tank4member4 = new Person("Jozef","Loader");

        Tank tank1 = new Tank("M4 Sherman", "USA");
        tank1.crew.add(tank1member1);
        tank1.crew.add(tank1member2);
        tank1.crew.add(tank1member3);
        Tank tank2 = new Tank("PanzerII", "Germany");
        tank2.crew.add(tank2member1);
        tank2.crew.add(tank2member2);
        tank2.crew.add(tank2member3);
        Tank tank3 = new Tank("T-34","Russia");
        tank3.crew.add(tank3member1);
        tank3.crew.add(tank3member2);
        tank3.crew.add(tank3member3);
        Tank tank4 = new Tank("7-TP","Polish");
        tank4.crew.add(tank4member1);
        tank4.crew.add(tank4member2);
        tank4.crew.add(tank4member3);


        ArrayList<Tank> tankList = new ArrayList<>();
        tankList.add(tank1);
        tankList.add(tank2);
        tankList.add(tank3);
        tankList.add(tank4);
        for (int x = 0; x < tankList.size(); x++) {
            System.out.println(tankList.get(x).natioanlity+" | "+tankList.get(x).name+" crew:");
            for (Person person : tankList.get(x).crew) {
                System.out.println("Name: "+person.name+" | Job: "+person.job);
            }
            System.out.println();
        }
//        for (int i = 0; i < tankList.size(); i++) {
//            tankList.get(i).crew.removeFirst();
//        }


        ArrayList<Bullet> ammunitionMagazine = new ArrayList<>(100000);

        Bullet bullet = new Bullet(7.62d,154,38.7d,"boat tail","spear tip","coppr/steel");

        for (int i = 0; i < 100000; i++) {
            if(ammunitionMagazine.isEmpty())
            {
                for (int j = 0; j < 100000; j++) {
                    ammunitionMagazine.add(bullet);
                }
            } else{
                ammunitionMagazine.clear();
            }

        }
    }
}