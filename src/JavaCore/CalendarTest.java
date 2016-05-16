package JavaCore;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by wangweimin on 15/12/22.
 */
public class CalendarTest {

    public static void main(String[] args) {
        GregorianCalendar d = new GregorianCalendar();
        int today = d.get(Calendar.DAY_OF_MONTH);
        int month = d.get(Calendar.MONTH);

        d.set(Calendar.DAY_OF_MONTH, 1);
        int weekDay = d.get(Calendar.DAY_OF_WEEK);

        String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
        int firstDayOfWeek = d.getFirstDayOfWeek();

        int indent = 0;

        while (firstDayOfWeek != weekDay) {
            indent++;
            d.add(Calendar.DAY_OF_MONTH, -1);
            weekDay = d.get(Calendar.DAY_OF_WEEK);
        }

        do {
            System.out.printf("%4s", weekdayNames[weekDay]);
            d.add(Calendar.DAY_OF_MONTH, 1);
            weekDay = d.get(Calendar.DAY_OF_WEEK);
        } while (weekDay != firstDayOfWeek);

        System.out.println();

        for(int i = 0; i<indent; i++){
            System.out.print("   ");
        }

        d.set(Calendar.DAY_OF_MONTH, 1);

        do{
            int day = d.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d", day);

            if(day == today) System.out.print("*");

            d.add(Calendar.DAY_OF_MONTH, 1);
            weekDay = d.get(Calendar.DAY_OF_WEEK);
            if(weekDay == firstDayOfWeek) System.out.println();

        }while(month == d.get(Calendar.MONTH));
    }
}
