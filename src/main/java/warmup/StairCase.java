package warmup;

import java.util.Scanner;

/**
 * Created by sank on 2/16/16.
 */
public class StairCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        for(int i = 1; i <= length; i++) {
            System.out.println(printStair(length-i, i));
        }

    }

    public static String printStair(int a, int b) {
        String output = "";
        for(int i = 0; i < a; i++) {
            output = output + " ";
        }
        for(int j = 0; j < b; j++) {
            output = output + "#";
        }
        return output;
    }
}
