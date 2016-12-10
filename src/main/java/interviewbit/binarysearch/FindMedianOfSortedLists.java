package interviewbit.binarysearch;

import java.util.List;

/**
 * Created by sank on 12/9/16.
 */
public class FindMedianOfSortedLists {
    public static void main(String[] args) {

    }
    public static double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {

        int median = (a.size()+b.size())/2;
        return util(a, b, 0,a.size()-1, 0,b.size()-1, median);
    }


    public static double util(List<Integer> a, List<Integer>b, int i, int j, int k, int l, int median){

        if (j-i+1 == 0)
            return b.get(k+median);
        if (l-k+1 == 0)
            return a.get(i+median);
        if (median == 0)
            return a.get(i) < b.get(k) ? a.get(i): b.get(k);

        int mid1 = (i+j)/2;
        int mid2 = (k+l)/2;

        if(a.get(mid1) > b.get(mid2)){
            median = median-(mid2-k);
            k = mid2 +1;
        }
        else if(a.get(mid1) < b.get(mid2)){
            i = mid1 +1;
            median = median-(mid1-i);

        } else return a.get(mid1);


        return util(a,b,i,j,k,l,median);


    }
}
