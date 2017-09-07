import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Trademark {

    private static final Random r = new Random();

    public static List<Fruits> generateFruits(int count) {
        List<Fruits> fruits = new ArrayList<>(count);

        for(int i = 0; i < count; i++) {
            Fruits house = new Fruits();
            house.type = r.Fruits.Type();
            house.shelfLife = r.nextInt(90);
            house.date = r.nextInt(80);
            house.price = r.nextInt(150);
            fruits.add(fruits);
        }
        return  fruits;
    }

}
