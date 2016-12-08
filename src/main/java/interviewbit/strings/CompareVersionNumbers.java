package interviewbit.strings;

/**
 * Created by sank on 12/8/16.
 */
public class CompareVersionNumbers {
    public static void main(String[] args) {
        System.out.println(compareVersion("10.3", "10.3.0"));
    }
    public static int compareVersion(String a, String b) {
        String[] firstSplit = a.split("\\.");
        String[] secondSplit = b.split("\\.");

        int size = Math.min(firstSplit.length, secondSplit.length);
        for(int i=0; i < size; i++){
            if(Integer.parseInt(firstSplit[i]) > Integer.parseInt(secondSplit[i])){
                return 1;
            }
            else if(Integer.parseInt(firstSplit[i]) < Integer.parseInt(secondSplit[i])){
                return -1;
            }
        }

        if(firstSplit.length > secondSplit.length){
            if(Integer.parseInt(firstSplit[size]) != 0) {
                return 1;
            }
        } else if (firstSplit.length < secondSplit.length){
            if(Integer.parseInt(secondSplit[size]) != 0) {
                return -1;
            }
        }

        return 0;
    }

}
