
import java.util.Scanner;

public class LocalMinimum {

    public static int findLocalMin(int[] a) {
        int l = 0, r = a.length - 1;

        while (l < r) {
            int mid = (l + r) / 2;

            if (a[mid] > a[mid + 1])
                l = mid + 1;
            else
                r = mid;
        }

        return l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++)
            a[i] = sc.nextInt();

        int i = findLocalMin(a);

        System.out.println("Local minimum index: " + i);
        System.out.println("Value: " + a[i]);
    }
}
