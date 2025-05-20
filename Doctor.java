public class Doctor implements Analyzable {
    String specialization;

    public Doctor(String specialization) {
        this.specialization = specialization;
    }

    public void analyze(Patient[] patients) {
        System.out.println("\n--- Doctor Analysis ---");
        double totalCost = 0.0;
        int patientCount = 0;

        for (Patient p : patients) {
            if (p != null) {
                totalCost += p.treatmentCost;
                patientCount++;
            }
        }

        if (patientCount > 0) {
            System.out.println("Total patients: " + patientCount);
            System.out.println("Total cost: " + totalCost + " Baht");
        } else {
            System.out.println("No patients to analyze.");
        }
    }
}
