import java.util.LinkedList;

/**
 * ================================================================
 * MAIN CLASS - TrainConsistMgmnt
 * ================================================================
 *
 * Use Case 4: Ordered Consist Configuration
 *
 * Description:
 * This class demonstrates how the sequence of train bogies
 * is maintained using a LinkedList, simulating the physical 
 * chaining of nodes (bogies) together.
 *
 * At this stage, the application:
 * - Uses a doubly linked list structure
 * - Inserts elements at specific positions
 * - Detaches elements from the head and tail
 * - Maintains physical sequence order
 *
 * @author Developer
 * @version 4.0
 */
public class TrainConsistMgmnt {

    public static void main(String[] args) {

        // Display welcome banner for UC4
        System.out.println("=================================================");
        System.out.println(" UC4 - Ordered Consist Configuration (LinkedList)");
        System.out.println("=================================================\n");

        // Create a LinkedList for the consist to use specific methods like removeFirst()
        LinkedList<String> consist = new LinkedList<>();

        // ---- ADD Bogies ----
        // add() appends elements to the end of the list
        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(consist + "\n");

        // ---- INSERT (Middle of the consist) ----
        // add(index, element) inserts at a specific position
        consist.add(2, "Pantry Car");
        
        System.out.println("After Inserting 'Pantry Car' at position 2 (Index 2):");
        System.out.println(consist + "\n");

        // ---- DELETE (Head and Tail) ----
        // removeFirst() and removeLast() detach bogies from the ends
        System.out.println("Detaching first (Engine) and last (Guard) bogies...\n");
        consist.removeFirst();
        consist.removeLast();

        // ---- DISPLAY FINAL LIST ----
        System.out.println("Final Ordered Train Consist:");
        System.out.println(consist + "\n");

        System.out.println("UC4 operations completed successfully...");
    }
}