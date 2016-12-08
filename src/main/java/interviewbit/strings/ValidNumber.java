package interviewbit.strings;

/**
 * Created by sank on 12/8/16.
 */
public class ValidNumber {
    public static void main(String[] args) {
        System.out.println(isNumber(".3"));
    }
    public static int isNumber(final String a) {
        boolean isNum = false;
        int i = 0;
        while(i < a.length() && a.charAt(i) == ' '){
            i++;
        }

        if(i < a.length() && (a.charAt(i) == '+' || a.charAt(i) == '-')){
            i++;
        }

        while(i < a.length() && (a.charAt(i) <='9' && a.charAt(i) >='0')){
            i++;
            isNum = true;
        }

        if(i < a.length() && (a.charAt(i) == '.')){
            i++;
            isNum = false;
            while(i < a.length() && (a.charAt(i) <='9' && a.charAt(i) >='0')){
                i++;
                isNum = true;
            }
        }

        if(i < a.length() && (isNum && (a.charAt(i) == 'E' || a.charAt(i) == 'e'))){
            i++;
            isNum = false;
            if(i < a.length() && (a.charAt(i) == '+' || a.charAt(i) == '-')){
                i++;
            }

            while(i < a.length() && (a.charAt(i) <='9' && a.charAt(i) >='0')){
                i++;
                isNum = true;
            }
        }


        while(i < a.length() && a.charAt(i) == ' '){
            i++;
        }

        if(isNum && (i==a.length())){
            return 1;
        }
        else return 0;

    }
}
