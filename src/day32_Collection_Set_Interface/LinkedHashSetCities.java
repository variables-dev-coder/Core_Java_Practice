package day32_Collection_Set_Interface;


import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetCities {
    public static void main(String[] args) {

        // List of cities with duplicates
        List<String> citiesWithDuplicates = Arrays.asList(
                "Hyderabad", "Delhi", "Mumbai", "Hyderabad", "Chennai", "Delhi", "Bangalore"
        );

        System.out.println("Original List with Duplicates:");
        System.out.println(citiesWithDuplicates);

        // Use LinkedHashSet to remove duplicates and maintain order
        LinkedHashSet<String> uniqueCities = new LinkedHashSet<>(citiesWithDuplicates);

        System.out.println("\nUnique Cities (No Duplicates, Insertion Order Preserved):");
        for (String city : uniqueCities) {
            System.out.println(city);
        }

        // Add a new city
        uniqueCities.add("Pune");

        // Remove a city
        uniqueCities.remove("Mumbai");

        System.out.println("\nAfter Adding Pune and Removing Mumbai:");
        System.out.println(uniqueCities);

    }
}

/*
Original List with Duplicates:
[Hyderabad, Delhi, Mumbai, Hyderabad, Chennai, Delhi, Bangalore]

Unique Cities (No Duplicates, Insertion Order Preserved):
Hyderabad
Delhi
Mumbai
Chennai
Bangalore

After Adding Pune and Removing Mumbai:
[Hyderabad, Delhi, Chennai, Bangalore, Pune]

 */