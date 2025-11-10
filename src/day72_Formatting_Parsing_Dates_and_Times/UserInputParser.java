package day72_Formatting_Parsing_Dates_and_Times;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInputParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (dd-MM-yyyy HH:mm): ");
        String input = sc.nextLine();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime userDateTime = LocalDateTime.parse(input, f);

        System.out.println("You entered: " + userDateTime);
    }
}

//Enter date (dd-MM-yyyy HH:mm): 08-11-2025 20:30
//You entered: 2025-11-08T20:30