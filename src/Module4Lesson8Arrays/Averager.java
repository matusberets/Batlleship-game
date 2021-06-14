package Module4Lesson8Arrays;

public class Averager {
    public static void main(String[] args) {
        double[] weekHighs = {80,70,75,69,72,74,90};
        double highSum = 0;

        for (double weekHigh : weekHighs) {
            highSum += weekHigh;
        }

        double averageHigh = highSum / weekHighs.length;
        System.out.println("Average is " + averageHigh);
    }
}
