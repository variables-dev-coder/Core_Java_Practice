package day59_Packages_And_import;

public class DateExample {
    public static void main(String[] args) {
        java.util.Date utilDate = new java.util.Date();
        System.out.println("java.util.Date: " + utilDate);

        java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
        System.out.println("java.sql.Date: " + sqlDate);
    }
}

//java.util.Date: Wed Sep 17 14:17:24 IST 2025
//java.sql.Date: 2025-09-17