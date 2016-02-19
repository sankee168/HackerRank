package Implementation;

import java.util.Scanner;

/**
 * Created by sank on 2/19/16.
 */
public class FindDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < testCases; i++) {
            long n = Long.parseLong(scanner.nextLine());
            System.out.println(count(n));
        }
        return;
    }

    private static int count(long n) {
        int count = 0;
        long temp = n;
        while (temp > 0) {
            if ((temp%10 != 0) && (n % (temp % 10) == 0)) {
                count++;
            }
            temp = temp/10;
        }
        return count;
    }
}
