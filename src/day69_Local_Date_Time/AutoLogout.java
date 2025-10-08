package day69_Local_Date_Time;

// Auto Logout After Specific Time (LocalTime comparison)

import java.time.LocalTime;

public class AutoLogout {
    public static void main(String[] args) {
        LocalTime loginTime = LocalTime.of(9, 0);  // 9:00 AM
        LocalTime logoutTime = loginTime.plusHours(8); // 8 working hours

        LocalTime now = LocalTime.now();

        if (now.isAfter(logoutTime)) {
            System.out.println(" Auto-logging out due to inactivity.");
        } else {
            System.out.println(" Still within working hours.");
        }
    }
}

//Auto-logging out due to inactivity.

//Concepts Used:
//plusHours(), isAfter()
//Simulates session timeout logic used in enterprise systems.
//Real-world use: Auto logout, system access control, time-based tasks.