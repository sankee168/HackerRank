package warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sank on 1/11/16.
 */
public class SolveMeFirst {
    public static void main(String args[]) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        try {
            for(int j = 0; j < 2; j++) {
                int curr = Integer.parseInt(br.readLine());
                if(curr >= 1 && curr <= 1000) {
                    i = i + curr;
                }
                else
                    return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(i);
    }
}