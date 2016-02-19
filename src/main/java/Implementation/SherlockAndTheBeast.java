package Implementation;

import java.util.Scanner;

/**
 * Created by sank on 2/19/16.
 */
public class SherlockAndTheBeast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < T; i++) {
            String s = "";
            int N = Integer.parseInt(scanner.nextLine());
            for (int j = N; j >= 0; j--) {
                if (j % 3 == 0 && (N - j) % 5 == 0) {
                    s = repeat("5", j) + repeat("3", N - j);
                    break;
                }
            }

            if (s == "")
                System.out.println("-1");
            else
                System.out.println(s);
        }
        return;
    }

    public static String repeat(String s, int j) {
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < j; i++) {
            ret.append(s);
        }
        return ret.toString();
    }
}
