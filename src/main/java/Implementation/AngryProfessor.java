package Implementation;

import java.util.Scanner;

/**
 * Created by sank on 2/19/16.
 */
public class AngryProfessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcaseCount = Integer.parseInt(scanner.nextLine());
        int studentsInClass;
        int threshold;
        String[] arrivalTime;

        for (int i = 0; i < testcaseCount; i++) {
            String[] temp = scanner.nextLine().split(" ");
            studentsInClass = Integer.parseInt(temp[0]);
            threshold = Integer.parseInt(temp[1]);
            arrivalTime = scanner.nextLine().split(" ");
            int count = 0;
            for (int j = 0; j < studentsInClass; j++) {

                if (Integer.parseInt(arrivalTime[j]) <= 0) {
                    count++;
                }
            }
            if (count >= threshold) {
                System.out.println("NO");
            } else System.out.println("YES");
        }
        return;
    }
}
