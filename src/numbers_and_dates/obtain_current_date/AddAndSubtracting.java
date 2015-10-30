package numbers_and_dates.obtain_current_date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: woody
 * Date: 15-10-30
 * Time: 下午11:48
 * To change this template use File | Settings | File Templates.
 */
public class AddAndSubtracting {
    public static void  calcutateDate(){
        Calendar cal  = Calendar.getInstance();
        System.out.println(formatDate(cal));
        cal.add(Calendar.MONTH,2);
        System.out.println(formatDate(cal));

    }

    public static String formatDate(Calendar calendar){
        /**
         * be attention with the "yyyy-MM"  is "MM" ,not "mm"
         */
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aaa");
        return format.format(calendar.getTime());
    }

    public static void main(String[] args) {
        calcutateDate();
    }
}
