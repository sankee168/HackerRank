package Implementation;

/**
 * Created by sank on 12/3/16.
 */
public class Gigster {
    public static void main(String[] args) {
        System.out.println(solution("23:14", "22:59"));
    }

    public static int solution(String E, String L) {

        int totalCost = 0;
        String[] entryTemp = E.split(":");
        String[] leaveTemp = L.split(":");
        int entryHour = Integer.parseInt(entryTemp[0]);
        int entryMin = Integer.parseInt(entryTemp[1]);

        int leaveHour = Integer.parseInt(leaveTemp[0]);
        int leaveMin = Integer.parseInt(leaveTemp[1]);

        if(entryHour > 23 || entryMin > 59 || leaveHour > 23 || leaveMin > 59){
            try {
                throw new Exception("Input format is wrong. Please insert 0 < hour < 23 and 0 < minutes < 59");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.exit(1);
        }

        if(leaveHour - entryHour < 0) {
            try {
                throw new Exception("Entry hour should be less than leave hour");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.exit(1);
        }

        int diffHours = leaveHour - entryHour;
        int diffMin = leaveMin - entryMin;

        if (diffMin < 0) {
            diffHours--;
            diffMin = 60 - diffMin;
        }

        if (diffHours == 0) {
            if (diffMin != 0) {
                //entry
                totalCost = totalCost + 2;
                //partial
                totalCost = totalCost + 3;
            }
        } else {
            totalCost = totalCost + 2 + 3 + 4 * (diffHours - 1);

            if (diffMin > 0) {
                totalCost = totalCost + 4;
            }
        }

        return totalCost;
    }
}
