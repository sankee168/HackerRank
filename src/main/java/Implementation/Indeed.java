package Implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sank on 12/2/16.
 */
public class Indeed {

//    public static void main(String[] args) {
//
//    }
//
//
//    static int[] getMin(String[] arr) {
//        int[] returnArray = new int[arr.length];
//        for(int i = 0; i < arr.length; i++){
//            String curr = arr[i];
//            String[] temp = curr.split(" ");
//            int low = Integer.parseInt(temp[0]);
//            int high = Integer.parseInt(temp[1]);
//            returnArray[i] = (int)(Math.floor(Math.sqrt(high)) - Math.ceil(Math.sqrt(low)) + 1);
//        }
//        return returnArray;
//    }
//
//
//    static String[] getSomething(String[] commands) {
//
//        String[] returnValues = new String[commands.length];
//
//        if(commands.length == 0) return returnValues;
//
//
//        for(int i = 0; i< commands.length; i++){
//            String currCommands = commands[i];
//            int direction = 1;
//            int x = 0;
//            int y = 0;
//            for(int j = 0; j< 4; j++){
//                for(int k = 0; k < currCommands.length(); k++){
//                    char temp = currCommands.charAt(k);
//                    if(temp=='L'){
//                        direction = direction + 1;
//                        direction = direction % 4;
//                    }else if(temp == 'R'){
//                        direction = direction - 1;
//                        if(direction < 0){
//                            direction = direction + 4;
//                        }
//                        direction = direction % 4;
//                    }else{
//                        if(direction == 0){
//                            y--;
//                        }
//                        else if(direction == 1){
//                            x++;
//                        }
//                        else if(direction == 2){
//                            y++;
//                        }
//                        else
//                            x--;
//                    }
//                }
//            }
//
//            if(x == 0 && y == 0 && direction ==1){
//                returnValues[i] = "YES";
//            }
//            else returnValues[i] = "NO";
//
//        }
//        return returnValues;
//
//
////        int dir=1; //1 is east; 2 north etc.
//////        Pair pos;
////        pos = new Pair(0,0);  //start at origin
////        for(int i=0;i<4;i++) {
////            for(int j=0;j<commands.length(); j++)
////            {
////                if(commands.charAt(j)=='G')
////                {
////                    if(dir==1) pos.first++;  if(dir==2) pos.second++;
////                    if(dir==3) pos.first--; if(dir==0) pos.second--;
////                }
////                if(commands.charAt(j)=='L') {dir++; dir = dir%4;}
////                if(commands.charAt(j)=='R') {
////                    dir--;
////                    if(dir<0) dir = 4+dir;
////                    dir = dir%4;
////                }
////            }
////        }
////        if(pos.first==0 && pos.second==0 && dir==1) return "YES"; else return "NO";
//
//    }


    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        List<Integer> superStk = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

        int numOfOperations = sc.nextInt();
        sc.nextLine();
        for(int i =0; i< numOfOperations; i++){

            String line = sc.nextLine();
            String opr = line.split(" ")[0];
            if(opr.startsWith("push")){
                int val = Integer.parseInt(line.split(" ")[1]);
                superStk.add(0,val);
            }
            else if(opr.startsWith("pop")){
                superStk.remove(0);
            }
            else{
                int noOfNodes = Integer.parseInt(line.split(" ")[1]);
                int inc = Integer.parseInt(line.split(" ")[2]);

                noOfNodes = Math.min(noOfNodes, superStk.size());

                for(int j = superStk.size()-1; j>= superStk.size()-noOfNodes; j--){
                    superStk.set(j,superStk.get(j)+inc);
                }

            }
            printTop(superStk);
        }
    }
    static void printTop(List<Integer> stk){
        if(stk.isEmpty()){
            System.out.println("EMPTY");
            return;
        }

        System.out.println(stk.get(0));
    }

}
