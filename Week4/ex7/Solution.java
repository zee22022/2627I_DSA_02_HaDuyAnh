import java.util.*;

public class Solution {

    public static List<Integer> countingSort(List<Integer> arr) {
        int[] count = new int[100];

        for (int x : arr) {
            count[x]++;
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            result.add(count[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        List<Integer> result = countingSort(arr);

        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}