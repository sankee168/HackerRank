package warmup;

import java.util.Scanner;

/**
 * Created by sank on 2/16/16.
 */
public class AVeryBigSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCount = Integer.parseInt(scanner.nextLine());
        String[] givenIntegers = scanner.nextLine().split(" ");
        long sum = 0;
        for(int i = 0; i < givenIntegers.length; i ++) {
            sum = sum + Long.parseLong(givenIntegers[i]);
        }
        System.out.println(sum);
    }
}
