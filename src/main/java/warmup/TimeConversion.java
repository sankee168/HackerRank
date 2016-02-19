package warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sank on 2/16/16.
 */
public class TimeConversion {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input;

        try {
            while ((input = bf.readLine()) != null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ssa");
                Date date = null;
                try {
                    date = simpleDateFormat.parse(input);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
                System.out.println(simpleDateFormat.format(date));
                System.exit(1);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
