package warmup;

import java.util.Scanner;

/**
 * Created by sank on 1/11/16.
 */
public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size, i = 0;
        int sum = 0;
        size = in.nextInt();
        System.out.println(size);
        while(i < size){
            sum = sum + in.nextInt();
            i++;
        }
        System.out.println(sum);
    }
}
