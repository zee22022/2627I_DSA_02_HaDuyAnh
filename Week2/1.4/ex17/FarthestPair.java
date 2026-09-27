
public class FarthestPair {

    public static double[] findFarthestPair(double[] a) {
        double min = a[0], max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) min = a[i];
            if (a[i] > max) max = a[i];
        }

        return new double[]{min, max};
    }

    public static void main(String[] args) {
        double[] a = {3.5, -10.2, 4.8, 15.1, 0.0, -2.5};
        double[] result = findFarthestPair(a);

        System.out.println("Farthest pair: " + result[0] + " and " + result[1]);
        System.out.println("Distance: " + (result[1] - result[0]));
    }
}
