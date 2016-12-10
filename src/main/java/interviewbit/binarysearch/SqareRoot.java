package interviewbit.binarysearch;

/**
 * Created by sank on 12/9/16.
 */
public class SqareRoot {
    public static void main(String[] args) {
        System.out.println(sqrt(2147483647));
    }
    public static int sqrt(int a) {
        long start = 0; long end = a;
        long ans = 0;
        while(start <= end){
            long mid = (start+end)/2;

            if(mid*mid == a){
                return (int)mid;
            }

            if(mid*mid < a){
                ans = mid;
                start = mid +1;
            }

            if(mid*mid > a){
                end = mid -1;
            }

        }

        return (int)ans;
    }
}
