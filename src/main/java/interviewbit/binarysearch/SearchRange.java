package interviewbit.binarysearch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sank on 12/9/16.
 */
public class SearchRange {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        System.out.println(searchRange(list,1));
    }
    public static ArrayList<Integer> searchRange(final List<Integer> a, int b) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int start = 0;
        int end = a.size() - 1;
        int mid = 0;
        int left = -1;
        int right = -1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (a.get(mid) > b) {
                end = mid - 1;
            } else if(a.get(mid) < b){
                start = mid + 1;
            }else {
                left = mid;
                right = mid;
                while (left > start && a.get(left-1) == b){
                    left --;
                }
                while (right < end && a.get(right+1) == b){
                    right++;
                }
                break;
            }
        }


        temp.add(left);
        temp.add(right);
        return temp;

    }
}
