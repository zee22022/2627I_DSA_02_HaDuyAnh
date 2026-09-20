
import java.io.File;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EqualPairs {

    public static int countEqualPairs(int[] a) {
        if (a == null || a.length < 2) {
            return 0;
        }

        Arrays.sort(a);

        int result = 0;
        int current = 1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                current++;
            } else {
                result  += current * (current - 1) / 2;
                current = 1;
            }
        }

        result  += current * (current - 1) / 2;

        return result;
    }

    public static void main(String[] args) {
        String filePath = "numbers.txt";
        List<Integer> list = new ArrayList<>();

        Scanner scanner = new Scanner(new File(filePath));

        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }

        scanner.close();

        int[] a = list.stream().mapToInt(Integer::intValue).toArray();

        int count = countEqualPairs(a);

        System.out.println("Total number of elements N: " + a.length);
        System.out.println("Number of pairs with equal values: " + count);
    }
}

