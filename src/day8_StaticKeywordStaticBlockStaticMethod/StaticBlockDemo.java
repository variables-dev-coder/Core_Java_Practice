package day8_StaticKeywordStaticBlockStaticMethod;


class AppConfig {
    static String dbUrl;
    static String dbUser;

    // Static block for initialization
    static {
        System.out.println("Static block executed.....");
        dbUrl = "jdbc:mysql://localhost:3306/hospital";
        dbUser = "admin";
    }

    static void printConfig() {
        System.out.println("DB URL: " + dbUrl);
        System.out.println("DB USER: " + dbUser);
    }

}
public class StaticBlockDemo {
    public static void main(String[] args) {
        AppConfig.printConfig();
    }
}
