package Assignment1;

public class Main {

    public static void main(String... args) {
        PIDManager manager = new PIDManager();
        int initialized = manager.allocateMap();

        // Check if initialized memory successfully
        if (initialized == 1) {
            System.out.println("PID map has been created successfully");

            // Allocate a couple of PIDs
            System.out.println("Allocated PID - " + manager.allocatePID());
            System.out.println("Allocated PID - " + manager.allocatePID());
            System.out.println("Allocated PID - " + manager.allocatePID());

            // Release a PID
            manager.releasePID(300);
            System.out.println("Released PID - " + 300);

            // Allocate the next available PID which should be 300
            // because we just released it.
            System.out.println("Allocated PID - " + manager.allocatePID());
        }
    }
}