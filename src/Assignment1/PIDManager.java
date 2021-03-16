package Assignment1;

public class PIDManager {

    private final int MIN_PID = 300;
    private final int MAX_PID = 5000;

    private int[] pidMap;

    public int allocateMap() {
        pidMap = new int[MAX_PID - MIN_PID];

        // Redundant but the assignment says to do so
        if (pidMap == null)
            return -1;

        return 1;
    }

    public int allocatePID() {
        if (pidMap == null)
            return -1;

        for (int i = 0; i < pidMap.length; i++) {
            if (pidMap[i] == 0) {
                pidMap[i] = 1;
                return i + MIN_PID;
            }
        }

        return -1;
    }

    public void releasePID(int pid) {
        if (pidMap == null || (pid < MIN_PID || pid > MAX_PID))
            return;

        int index = pid - MIN_PID;
        if (pidMap[index] == 1) {
            pidMap[index] = 0;
        }
    }
}
