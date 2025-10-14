package day71_Period_Duration;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2020, 5, 10);
        LocalDate endDate = LocalDate.of(2025, 10, 8);

        Period period = Period.between(startDate, endDate);

        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());

        System.out.println("\nTotal Period: " + period);
    }
}

//Years: 5
//Months: 4
//Days: 28
//
//Total Period: P5Y4M28D