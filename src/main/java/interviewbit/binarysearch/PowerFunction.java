package interviewbit.binarysearch;

/**
 * Created by sank on 12/9/16.
 */
public class PowerFunction {
    public static void main(String[] args) {
        System.out.println(pow(71045970,41535484,64735492));
    }

    public static int pow(int x, int n, int d) {

        long ans = util(x, n);

        if(ans < 0){
            return (int)((ans+d)%d);
        }

        return (int)(ans%d);

    }

    public static long util(int x, int n){
        long ans = 0;
        if(n ==0) return 1;
        if(n ==1) return x;

        if(n<0) return 1/util(x, Math.abs(n));

        long temp = util(x, n/2);

        if(n%2 == 0){
            ans = temp*temp;
        }
        else ans = temp*temp*x;

        return ans;
    }

//    public static int pow(int x, int n, int d) {
//        long a = x;
//        long res = 1L;
//
//        while (n > 0) {
//
//            if (n % 2 == 1) {
//                res = res * a;
//                res = res % d;
//            }
//
//            a = a*a;
//            a = a%d;
//            n = n >> 1;
//
//        }
//
//        res = (res + d) % d;
//
//        return (int) res;
//    }
}
