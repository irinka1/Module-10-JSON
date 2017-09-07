public class Fruits {

    public Type type;
    public int shelfLife;
    public int date;
    public double price;
    public enum Type {strawberry, plum, peach, cherry, pear, raspberries, blackberry, watermelon, apple,barberry}

    public Fruits(Type type, int shelfLife, int date, double price) {
        this.type = type;
        this.shelfLife = shelfLife;
        this.date = date;
        this.price = price;
    }

    public Fruits() {
    }
}
