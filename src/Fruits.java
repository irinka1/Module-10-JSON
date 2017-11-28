import java.time.LocalDate;
import java.util.*;


public class Fruits {

    @Override
    public String toString() {
        return "Fruits{" +
                "type='" + type + '\'' +
                '}';
    }

    public String type;
    public int shelfLife;
    public LocalDate date;
    public double price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
