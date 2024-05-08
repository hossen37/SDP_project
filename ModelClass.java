
package blood_management_system_final;

import java.io.*;
import javax.swing.table.DefaultTableModel;

public class ModelClass {

    private final String filePath = "data.txt";

    public void saveToFile(String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(data + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public DefaultTableModel loadDataFromFile() {
        DefaultTableModel model = new DefaultTableModel(new Object[]{"Name", "Email", "Phone", "Blood Group", "Address"}, 0);
        File file = new File(filePath);
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] data = line.split(",");
                    model.addRow(data);
                }
            } catch (IOException e) {
                System.out.println("Error reading from file: " + e.getMessage());
            }
        }
        return model;
    }
}
