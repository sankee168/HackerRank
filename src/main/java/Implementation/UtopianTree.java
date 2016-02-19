package Implementation;

import java.util.Scanner;

/**
 * Created by sank on 2/19/16.
 */
public class UtopianTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcaseCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < testcaseCount; i++) {
            System.out.println(height(scanner.nextInt()));
        }
        return;
    }

    private static int height(int height) {
        int ret = 0;
        for(int i = 0; i <= height; i++) {
            if(i%2 == 0) ret = ret + 1;
            else ret = 2*ret;
        }
        return ret;
    }
}

