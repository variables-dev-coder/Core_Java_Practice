package day8_StaticKeywordStaticBlockStaticMethod;


class Hospital {
    static String hospitalName = "SNR HOSPITAL";
    String patientName;
    int patientId;

    Hospital(String patientName, int patientId) {
        this.patientName = patientName;
        this.patientId = patientId;
    }

    void patientDetails() {
        System.out.println("Hospital Name: " + hospitalName + " Patient Name: " +
                            patientName + " Patient Id: " + patientId);
    }
}
public class StaticHospitalDemo {
    public static void main(String[] args) {

        Hospital h1 = new Hospital("Joy poul", 115);
        Hospital h2 = new Hospital("Sweeta Das", 213);

        h1.patientDetails();
        h2.patientDetails();
    }
}
