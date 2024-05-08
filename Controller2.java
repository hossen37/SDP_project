package blood_management_system_final;

import java.io.FileReader;
import java.util.Scanner;

public class Controller2 {
    private BloodBank view;  

    public Controller2(BloodBank view) {
        this.view = view;
    }

    public void seeAllAvailableBlood() {
        double unit = 0.45;
        int[] bloodTypeCounts = new int[8];  // Holds counts for A+, B+, AB+, O+, A-, B-, O-, AB-
        int totalDonors = 0;
        int totalRequests = 0;

        try (Scanner scan = new Scanner(new FileReader("data1.txt"))) {
            scan.useDelimiter("[,\n]");
            while (scan.hasNext()) {
                scan.next();
                totalRequests++;
            }
        } catch (Exception e) {
            System.err.println("Error reading total requests: " + e.getMessage());
        }

        view.getTr().setText("Total Request: " + totalRequests / 5);
        view.getTa().setText("Total approved: " + totalRequests / 5);

        try (Scanner scan = new Scanner(new FileReader("data.txt"))) {
            scan.useDelimiter("[,\n]");
            while (scan.hasNext()) {
                String bg = scan.next();
                switch (bg) {
                    case "A+": bloodTypeCounts[0]++; break;
                    case "B+": bloodTypeCounts[1]++; break;
                    case "AB+": bloodTypeCounts[2]++; break;
                    case "O+": bloodTypeCounts[3]++; break;
                    case "A-": bloodTypeCounts[4]++; break;
                    case "B-": bloodTypeCounts[5]++; break;
                    case "O-": bloodTypeCounts[6]++; break;
                    case "AB-": bloodTypeCounts[7]++; break;
                }
                totalDonors++;
            }
        } catch (Exception e) {
            System.err.println("Error reading blood types: " + e.getMessage());
        }

        view.updateBloodCounts(bloodTypeCounts);
        view.getTotatDonars().setText("Total Donors: " + totalDonors);
        view.getTb().setText("Total Blood: " + unit * totalDonors);
    }
}
