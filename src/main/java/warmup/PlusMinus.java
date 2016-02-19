package warmup;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Created by sank on 2/16/16.
 */
public class PlusMinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = Integer.parseInt(scanner.nextLine());
        String[] inputArray = scanner.nextLine().split(" ");
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < sizeOfArray; i++) {
            if (Integer.parseInt(inputArray[i]) > 0) {
                positive = positive + 1;
            } else if (Integer.parseInt(inputArray[i]) < 0) {
                negative = negative + 1;
            }

        }

        System.out.println(new BigDecimal(positive).divide(new BigDecimal(sizeOfArray), 6, RoundingMode.HALF_UP) + " " +
                new BigDecimal(negative).divide(new BigDecimal(sizeOfArray), 6, RoundingMode.HALF_UP) + " " +
                new BigDecimal(sizeOfArray - positive - negative).divide(new BigDecimal(sizeOfArray), 6, RoundingMode.HALF_UP));
    }
}
