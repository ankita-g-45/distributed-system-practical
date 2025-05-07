import java.util.ArrayList;

public class BerkeleyClockSync {
    public static void main(String[] args) {
        int[] systemClocks = {10, 12, 13, 11, 14};
        int masterClock = 0;

        // Print the initial system clocks
        System.out.print("System clocks: ");
        for (int clock : systemClocks) {
            System.out.print(clock + " ");
        }
        System.out.println();

        // Calculate average clock time (including master)
        int sum = 0;
        for (int clock : systemClocks) {
            sum += clock;
        }
        int averageClock = sum / systemClocks.length;

        // Calculate time difference for each clock
        ArrayList<Integer> timeDifferences = new ArrayList<>();
        for (int clock : systemClocks) {
            timeDifferences.add(averageClock - clock);
        }

        // Print time differences (optional, shows calculation logic)
        System.out.print("Time differences: ");
        for (int diff : timeDifferences) {
            System.out.print(diff + " ");
        }
        System.out.println();

        // Update each system clock based on time difference
        System.out.print("Updated system clocks: ");
        for (int i = 0; i < systemClocks.length; i++) {
            systemClocks[i] += timeDifferences.get(i);
            System.out.print(systemClocks[i] + " ");
        }
        System.out.println();

        // Set master clock to average
        masterClock = averageClock;
        System.out.println("Master clock: " + masterClock);
    }
}
