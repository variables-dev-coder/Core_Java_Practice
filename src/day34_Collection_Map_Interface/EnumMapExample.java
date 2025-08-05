package day34_Collection_Map_Interface;

import java.util.EnumMap;

public class EnumMapExample {
    public static void main(String[] args) {
        // Create EnumMap with Day as key
        EnumMap<Day, String> dayTypeMap = new EnumMap<>(Day.class);

        // Add entries
        dayTypeMap.put(Day.MONDAY, "Working Day");
        dayTypeMap.put(Day.TUESDAY, "Working Day");
        dayTypeMap.put(Day.WEDNESDAY, "Working Day");
        dayTypeMap.put(Day.THURSDAY, "Working Day");
        dayTypeMap.put(Day.FRIDAY, "Working Day");
        dayTypeMap.put(Day.SATURDAY, "Weekend");
        dayTypeMap.put(Day.SUNDAY, "Weekend");

        // Print map
        for (Day day : Day.values()) {
            System.out.println(day + " → " + dayTypeMap.get(day));
        }
    }
}
