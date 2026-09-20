
import java.util.Arrays;

public class ClosestPair {

    public static double[] findClosestPair(double[] a) {
        Arrays.sort(a);

        double min = a[1] - a[0];
        double x = a[0], y = a[1];

        for (int i = 1; i < a.length - 1; i++) {
            if (a[i + 1] - a[i] < min) {
                min = a[i + 1] - a[i];
                x = a[i];
                y = a[i + 1];
            }
        }

        return new double[]{x, y};
    }

    public static void main(String[] args) {
        double[] a = {3.5, -10.2, 4.8, 15.1, 4.9, -2.5};
        double[] result = findClosestPair(a);

        System.out.println("Closest pair: " + result[0] + " and " + result[1]);
        System.out.println("Distance: " + (result[1] - result[0]));
    }
}
