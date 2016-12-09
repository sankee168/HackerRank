package interviewbit.strings;

/**
 * Created by sank on 12/8/16.
 */
public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));
    }
    public static int romanToInt(String a) {
        int returnValue = 0;
        char[] charArray = a.toCharArray();
        int i = 0;
        while(i < charArray.length-1){
            if(value(charArray[i]) < value(charArray[i+1])){
                returnValue = returnValue - value(charArray[i]);
            }
            else {returnValue = returnValue + value(charArray[i]); }
            i++;
        }

        returnValue = returnValue + value(charArray[i]);
        return returnValue;
    }


    public static int value(char a){
        if(a == 'I'){
            return 1;
        }
        else if(a == 'V'){
            return 5;
        }
        else if(a == 'X'){
            return 10;
        }
        else if(a == 'L'){
            return 50;
        }
        else if(a == 'C'){
            return 100;
        }
        else if(a == 'D'){
            return 500;
        }
        else if(a == 'M'){
            return 1000;
        }

        return 0;
    }
}
