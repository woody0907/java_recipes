package numbers_and_dates.obtain_current_date;

import java.util.Date;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: woody
 * Date: 15-10-30
 * Time: 下午11:59
 * To change this template use File | Settings | File Templates.
 */
public class FindDifference {

    public static void findDifferences(){
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2015,8,31,12,0);

        Date  date1 = new Date();
        System.out.println(date1);
        long mill = Math.abs(cal2.getTimeInMillis()-date1.getTime());
        System.out.println(mill);
        long hours = TimeUnit.MILLISECONDS.toHours(mill);
        long days = TimeUnit.HOURS.toDays(hours);
        String diff = String.format("%d hours %d days",hours,days);
        System.out.println(diff);
    }

    public static void main(String[] args) {
        findDifferences();
    }
}
