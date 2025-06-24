package day8_StaticKeywordStaticBlockStaticMethod;


class SoftwareCompany {
    static String companyName;
    static String companyLocation;

    // Static Block Initialization
    static {
        System.out.println("Static Block Executed...");
        companyName = "Digi Tech";
        companyLocation = "Hyderabad";
    }

    static void companyDetails() {
        System.out.println("Company Name: " + companyName + " Company Location: " + companyLocation);
    }
}
public class StaticSoftwareCompanyDemo {
    public static void main(String[] args) {

        SoftwareCompany.companyDetails();

    }
}
