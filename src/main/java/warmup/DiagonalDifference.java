package warmup;


import java.util.Scanner;

/**
 * Created by sank on 2/16/16.
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        String matrix[][] = new String[lines][lines];
        for(int i = 0; i < lines; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }

        for(int i = 0; i < lines; i++) {
            sum1 = sum1 + Integer.parseInt(matrix[i][i]) - Integer.parseInt(matrix[i][lines-i]);
        }
        System.out.println(Math.abs(sum1));
    }
}
