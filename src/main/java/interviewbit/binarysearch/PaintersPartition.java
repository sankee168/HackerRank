package interviewbit.binarysearch;

import java.util.ArrayList;

/**
 * Created by sank on 12/9/16.
 */
public class PaintersPartition {
    public static int paint(int a, int b, ArrayList<Integer> c) {
        int painters = a;
        int unitTime = b;


        long maxLength = 0;
        long minLength = 0;
        for(int curr : c){
            maxLength = maxLength + curr;
            if(minLength < curr){
                minLength = curr;
            }
        }

        while (minLength < maxLength){
            long mid = (minLength + maxLength)/2;
            int painterCount = getCountOfPainters(mid, c, a);

            if(painterCount <= a){
                maxLength = mid;
            }
            else{
                minLength = mid+1;
            }

        }

        return (int)(minLength*b%10000003);
    }

    static int getCountOfPainters(long maxPerPeson, ArrayList<Integer> c, int maxPainters){
        int painters = 1;

        int temp = 0;
        for(int i = 0; i < c.size(); i++){
            temp = temp + c.get(i);
            if(temp > maxPerPeson){
                painters++;
                temp = c.get(i);
            }
        }
        return painters;
    }



}
