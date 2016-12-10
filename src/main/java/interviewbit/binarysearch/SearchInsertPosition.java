package interviewbit.binarysearch;

import java.util.ArrayList;

/**
 * Created by sank on 12/9/16.
 */
public class SearchInsertPosition {
    public int searchInsert(ArrayList<Integer> a, int b) {
        int low = 0;
        int high = a.size()-1;

        int index = 0;
        while(low <= high){
            int mid = (low + high)/2;

            if(a.get(mid) == b){
                return mid;
            }
            else if(a.get(mid) < b){
                low = mid+1;
                index = low;
            }
            else {
                high = mid-1;
            }
        }

        return index;
    }
}
