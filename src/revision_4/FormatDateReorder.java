package revision_4;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FormatDateReorder {
    public static void main(String[] args) {
        Date date = new GregorianCalendar(2025, Calendar.AUGUST, 23, 11, 0, 0).getTime();
        String when = String.format("%1$tF %1$tT", date); // reuse 1st arg
        String msg  = String.format("%2$s scored %1$d", 95, "Munna"); // reorder args
        System.out.println(when);
        System.out.println(msg);
    }
}


/*

2025-08-23 11:00:00
Munna scored 95


Pro tips
Use Locale.ROOT/Locale.US for stable, non-regional formatting (e.g., %,.2f).
Prefer formatted(...) for readability when you already have the template string.
Use %n instead of \n for platform-independent newlines.

 */