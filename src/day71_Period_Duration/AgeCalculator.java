package day71_Period_Duration;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int year = sc.nextInt();
        System.out.print("Enter your birth month: ");
        int month = sc.nextInt();
        System.out.print("Enter your birth day: ");
        int day = sc.nextInt();

        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birthDate, today);

        System.out.println("You are " + age.getYears() + " years, " +
                age.getMonths() + " months, and " +
                age.getDays() + " days old.");
    }
}

//Enter your birth year: 1995
//Enter your birth month: 08
//Enter your birth day: 02
//You are 30 years, 2 months, and 12 days old.