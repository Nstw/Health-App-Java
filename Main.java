import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Patient[] patients = new Patient[1];

        for (int i = 0; i < patients.length; i++) {
            System.out.println("\nEnter details for Patient " + (i + 1));
            patients[i] = new Patient();
            patients[i].inputPatientInfo(scanner);
        }

        System.out.println("\n--- Patient Details ---");
        for (Patient p : patients) {
            p.displayPatientInfo();
            System.out.println();
        }

        Doctor doctor = new Doctor("Dentistry");
        doctor.analyze(patients);

        scanner.close();
    }
}
