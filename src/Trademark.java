import Utilities.RandomDate;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Trademark {

    public static final Random r = new Random();
    public Trademark(){}
    public static final String[] fruits2 = new String[] {
            "strawberry",
            "plum",
            "peach",
            "cherry",
            "pear",
            "raspberries",
            "blackberry",
            "watermelon",
            "apple",
            "barberry"
    };

    public static List<Fruits> generateFruits(int count) {
        List<Fruits> fruits = new ArrayList<>(count);
        RandomDate rd = new RandomDate(LocalDate.of(2017, 8, 1), LocalDate.of(2017, 12, 1));
        for (int i = 0; i < count; i++) {
            Fruits fruits1 = new Fruits();
            fruits1.type = fruits2[r.nextInt(fruits2.length - 1)];
            fruits1.shelfLife = r.nextInt(90);
            fruits1.date = rd.nextDate();
            fruits1.price = r.nextInt(150);
            fruits.add(fruits1);
        }
        return fruits;
    }

    public static void getAvailableFruits(LocalDate date, List<Fruits> fruitsList){
        int currentDate = (int) date.toEpochDay();
        for (int i = 0; i < fruitsList.size(); i++) {
            int day = ((int) fruitsList.get(i).getDate().toEpochDay()) + fruitsList.get(i).getShelfLife();
            if (currentDate < day){
                System.out.println(fruitsList.get(i).toString());
            }
        }
    }

    public static void getAvailableFruits(LocalDate date, String type, List<Fruits> fruits){
        int ourDate = (int) date.toEpochDay();

        for (int i = 0; i < fruits.size(); i++) {
            int day = ((int) fruits.get(i).getDate().toEpochDay()) + fruits.get(i).getShelfLife();

            if (fruits.get(i).getType().equals(type) && ourDate < day) {
                System.out.println(fruits.get(i).toString()+i);
            }
        }
    }

    public static void getSpoiledFruits(LocalDate date2,  List<Fruits> fruitsList) {
        for (int i = 0; i < fruitsList.size(); i++) {
            int ourDay = (int) date2.toEpochDay();
            int fruitDay = (int) fruitsList.get(i).date.toEpochDay() + fruitsList.get(i).getShelfLife();
            if (ourDay > fruitDay) {
                System.out.println(fruitsList.get(i).toString());
            }
        }
    }

    public static void getSpoiledFruits(LocalDate date2,  List<Fruits> fruitsList, String typeOfFruit) {
        for (int i = 0; i < fruitsList.size(); i++) {
            int ourDay = (int) date2.toEpochDay();
            int fruitDay = (int) fruitsList.get(i).date.toEpochDay()+ fruitsList.get(i).getShelfLife();
            if (ourDay > fruitDay && fruitsList.get(i).getType().equals(typeOfFruit)) {
                System.out.println(fruitsList.get(i).toString()+i);
            }
        }
    }
}
