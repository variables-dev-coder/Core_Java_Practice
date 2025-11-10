package day72_Formatting_Parsing_Dates_and_Times;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocaleFormatExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        DateTimeFormatter french = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.FRENCH);
        DateTimeFormatter german = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.GERMAN);
        DateTimeFormatter japanese = DateTimeFormatter.ofPattern("yyyy年MM月dd日", Locale.JAPANESE);

        System.out.println("French: " + date.format(french));
        System.out.println("German: " + date.format(german));
        System.out.println("Japanese: " + date.format(japanese));
    }
}

//French: 10 novembre 2025
//German: 10 November 2025
//Japanese: 2025年11月10日