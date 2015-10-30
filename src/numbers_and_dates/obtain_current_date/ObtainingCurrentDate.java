package numbers_and_dates.obtain_current_date;

import java.util.Calendar;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: woody
 * Date: 15-10-30
 * Time: 下午11:39
 * To change this template use File | Settings | File Templates.
 */
public class ObtainingCurrentDate {
    public static void withDate(){
        Date date = new Date();
        System.out.println(date.getTime());
    }

    public static void withCalendar(){
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DATE);
        System.out.println(year+" "+(month+1)+" "+day);
    }

    public static void main(String[] args) {
        withDate();
        withCalendar();
    }
}
