package interviewbit.strings;

import java.util.ArrayList;

/**
 * Created by sank on 12/8/16.
 */
public class ValidIpAddress {
    public static void main(String[] args) {
        System.out.println(restoreIpAddresses("0100100"));

    }

    public static ArrayList<String> restoreIpAddresses(String a) {
        ArrayList<String> finalResult = new ArrayList<String>();

        ArrayList<ArrayList<String>> tempWithDot = new ArrayList<ArrayList<String>>();
        ArrayList<String> tempStore = new ArrayList<String>();

        util(a, 0, tempWithDot, tempStore);


        for(int i = 0; i < tempWithDot.size(); i++){
            ArrayList<String> curr = tempWithDot.get(i);
            String ip = "";
            for(int j = 0; j < 4; j++){
                ip = ip + curr.get(j) +".";
            }

            ip = ip.substring(0, ip.length() -1);
            finalResult.add(ip);
        }
        return finalResult;
    }

    public static void util(String a, int start, ArrayList<ArrayList<String>> tempWithDot,
                     ArrayList<String> tempStore){
        if(tempStore.size() >=4 && start != a.length()){
            return;
        }

        if((tempStore.size()+a.length()-start+1)<4) {
            return;
        }

        if(tempStore.size() == 4 && start == a.length()){
            ArrayList<String> newOb = new ArrayList<String>(tempStore);
            tempWithDot.add(newOb);
            return;
        }

        for(int i = 1; i < 4; i++){
            if(i+start > a.length()){
                break;
            }

            String each = a.substring(start, start+i);
            if(i > 1 && each.charAt(0) == '0'){
                break;
            }
            if(Integer.parseInt(each) > 255){
                break;
            }

            tempStore.add(each);
            util(a, start+i, tempWithDot, tempStore);
            tempStore.remove(tempStore.size()-1);
        }
    }
}
