/**
 * Created by ruthless on 19/8/16.
 */

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class CVitaD {
    public static void main(String args[]) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String day=br.readLine();
        if(!(day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||(day.equals("Friday"))||(day.equals("Saturday"))||(day.equals("Sunday"))))
        {
            bw.write("Invalid Day\n");
            bw.flush();
        }
        else {
            String dat = br.readLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
            try {
                Date date = sdf.parse(dat);
                DateFormat format2=new SimpleDateFormat("EEEE");
                String finalDay=format2.format(date);
                bw.write(finalDay+"\n");
            } catch (Exception e) {
                bw.write("Invalid Date\n");
            }
        }
     bw.close();
    }
}