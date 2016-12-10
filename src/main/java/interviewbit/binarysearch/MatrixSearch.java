package interviewbit.binarysearch;

import java.util.ArrayList;

/**
 * Created by sank on 12/9/16.
 */
public class MatrixSearch {
    public static int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {

        if(a ==null || a.size() ==0) return 0;

        int m = a.size();
        int n = a.get(0).size();

        int start = 0;
        int end = m*n -1;

        while (start < end){
            int mid = (start + end)/2;

            int midx = mid/n;
            int midy = mid%n;

            if(a.get(midx).get(midy) == b){
                return 1;
            }
            else if(a.get(midx).get(midy) > b){
                end = mid-1;
            }else {
                start = mid+1;
            }

        }

        return 0;



    }


}
