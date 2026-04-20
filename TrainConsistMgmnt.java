import java.util.HashSet;
import java.util.Set;

/**
 * ================================================================
 * MAIN CLASS - TrainConsistMgmnt
 * ================================================================
 *
 * Use Case 3: Track Unique Bogie IDs
 *
 * Description:
 * This class ensures that duplicate bogie IDs are not
 * added into the train formation using HashSet.
 *
 * At this stage, the application:
 * - Stores bogie IDs
 * - Prevents duplicates automatically
 * - Displays unique bogie identifiers
 *
 * This maps uniqueness validation using Set.
 *
 * @author Developer
 * @version 3.0
 */
public class TrainConsistMgmnt {

    public static void main(String[] args) {

        // Display welcome banner for UC3
        System.out.println("=========================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("=========================================\n");

        // Create a Set to store unique bogie IDs
        // HashSet stores only unique values
        Set<String> bogies = new HashSet<>();

        // ---- ADD IDs (including duplicates) ----
        // add() inserts bogie IDs into the set
        System.out.println("Adding Bogie IDs: BG101, BG102, BG103, BG104");
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");
        
        // Intentionally adding duplicate values to test Set logic
        System.out.println("Attempting to add duplicate IDs: BG101, BG102");
        bogies.add("BG101");
        bogies.add("BG102");

        // Display final state to observe that duplicates were ignored
        System.out.println("\nFinal Unique Bogie IDs in Train Consist:");
        System.out.println(bogies + "\n");

        System.out.println("UC3 operations completed successfully...");
    }
}