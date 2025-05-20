public class Patient extends Person {
    String symptom;
    Double treatmentCost;

    public void inputPatientInfo(java.util.Scanner scanner) {
        inputBasicInfo(scanner);

        System.out.println("Select symptom:");
        System.out.println("1. Fever");
        System.out.println("2. Cough");
        System.out.println("3. Stomachache");

        int choice;
        while (true) {
            System.out.print("Enter choice (1-3): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) {
                symptom = "Fever";
                treatmentCost = 500.0;
                break;
            } else if (choice == 2) {
                symptom = "Cough";
                treatmentCost = 300.0;
                break;
            } else if (choice == 3) {
                symptom = "Stomachache";
                treatmentCost = 1200.0;
                break;
            } else {
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }
    }

    public void displayPatientInfo() {
        displayBasicInfo();
        System.out.println("Symptom: " + symptom);
        System.out.println("Treatment Cost: " + treatmentCost + " Baht");
    }
}
