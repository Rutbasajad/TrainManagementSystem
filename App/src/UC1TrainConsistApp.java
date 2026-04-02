import java.util.ArrayList;
import java.util.List;

public class UC1TrainConsistApp {

    public static void main(String[] args) {

        // Step 1: Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Initialize empty train consist
        List<String> trainConsist = new ArrayList<>();

        // Step 3: Display initialization message
        System.out.println("Train consist initialized successfully.");

        // Step 4: Display initial bogie count
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Step 5: Continue program
        System.out.println("System ready for further operations...");
    }
}