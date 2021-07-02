package module4IntroClassWriting;

public class Insect {
    private double weight;
    private int x;
    private int y;

    private final double DIST_WEIGHT_LOSS_FACTOR = .0001;

    public Insect(double weight, int x, int y) {
        this.weight = weight;
        this.x = x;
        this.y = y;
    }

    //methods
    public void eat(double amount) {
        System.out.println("Zasa zeries ?!");
        weight = weight + amount;
    }

    public void move(int newX, int newY) {
        double distance = calculateDistance(x, y, newX, newY);
        if (distance > 0) {
            x = newX;
            y = newY;
            weight = weight * DIST_WEIGHT_LOSS_FACTOR;
            System.out.printf("Moved %.2f units \n", distance);
        }
        else System.out.println("Staying put");
    }

    private static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));

    }
    //test method
    public static void main(String[] args) {
        Insect bug1 = new Insect(10, 100, 90 );
        Insect bug2 = new Insect(9.5, -300, 400 );

        bug1.eat(20.0);
        bug1.move(1,10);
        bug2.move(-300,400);
    }
}
