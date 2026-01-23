package dsa.scenariobased.bst;

import java.util.*;

//class Patient to store patient's data
class Patient {
	//attributes
    int patientId;
    String patientName;
    long checkInTime;

    //constructor
    Patient(int patientId, String patientName, long checkInTime) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.checkInTime = checkInTime;
    }
}

//main class
public class HospitalQueueManagement {

    static TreeMap<Long, Patient> patientQueue = new TreeMap<>();
    static Scanner sc = new Scanner(System.in);

    //main method
    public static void main(String[] args) {

    	//displaying menu
        while (true) {
            System.out.println("\nHospital Queue Management");
            System.out.println("1. Patient Registration");
            System.out.println("2. Discharge/Delete Patient");
            System.out.println("3. Display Patients by Arrival Time");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    registerPatient();
                    break;
                case 2:
                    dischargePatient();
                    break;
                case 3:
                    displayPatientsByArrival();
                    break;
                case 4:
                    System.out.println("Exiting system... ");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    // method to register a patient
    public static void registerPatient() {
        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        long time = System.currentTimeMillis(); // check-in time
        patientQueue.put(time, new Patient(id, name, time));

        System.out.println("Patient registered successfully!");
    }

    // method to delete patient record (discharging patient)
    public static void dischargePatient() {
        System.out.print("Enter Patient ID to discharge: ");
        int id = sc.nextInt();

        Long keyToRemove = null;

        for (Map.Entry<Long, Patient> entry : patientQueue.entrySet()) {
            if (entry.getValue().patientId == id) {
                keyToRemove = entry.getKey();
                break;
            }
        }

        if (keyToRemove != null) {
            patientQueue.remove(keyToRemove);
            System.out.println("Patient discharged successfully!");
        } else {
            System.out.println("Patient not found");
        }
    }

    // method to display patient by arrival time
    public static void displayPatientsByArrival() {
        if (patientQueue.isEmpty()) {
            System.out.println("No patients in queue.");
            return;
        }

        System.out.println("\nPatients by Arrival Time:");
        for (Patient p : patientQueue.values()) {
            System.out.println(
                "ID: " + p.patientId +
                ", Name: " + p.patientName +
                ", Check-in Time: " + new Date(p.checkInTime)
            );
        }
    }
}

