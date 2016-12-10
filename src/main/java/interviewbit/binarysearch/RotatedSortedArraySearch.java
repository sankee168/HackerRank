package interviewbit.binarysearch;

import java.util.List;

/**
 * Created by sank on 12/9/16.
 */
public class RotatedSortedArraySearch {
    public static int search(final List<Integer> a, int b) {

        int start = 0; int end = a.size()-1;

        while (start <= end){
            int mid =(start + end)/2;

            if(a.get(mid) == b){
                return mid;
            }
            else if(a.get(start) <= a.get(mid)){
                if(a.get(start) <= b && a.get(mid) > b){
                    end = mid-1;
                }
                else {
                    start = mid +1;
                }
            }
            else {
                if(a.get(mid) < b && a.get(end) >= b){
                    start = mid+1;
                }
                else {
                    end = mid -1;
                }
            }
        }

        return -1;
    }
}
