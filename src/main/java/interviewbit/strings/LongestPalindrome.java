package interviewbit.strings;

/**
 * Created by sank on 12/8/16.
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaaabaaa"));
    }

    public static String longestPalindrome(String s){
        if(s == null || s.length() <=1) return s;
        int len = s.length();
        String longest = "";
        boolean[][] temp = new boolean[len][len];
        for(int i = 0; i < len; i++){
            for (int j =0; j < len-i; j++){
                int k = j + i;
                if(s.charAt(j) == s.charAt(k) && (k-j<=2 || temp[j+1][k-1])){
                    temp[j][k] = true;

                    if(k-j+1 > longest.length()){
                        longest = s.substring(j,k+1);
                    }
                }
            }
        }
        return longest;
    }
}
