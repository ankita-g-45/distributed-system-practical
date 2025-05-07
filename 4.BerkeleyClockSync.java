import java.util.ArrayList;

public class BerkeleyClockSync {
    public static void main(String[] args) {
        int[] systemClocks = {10, 12, 13, 11, 14}; // Array of system clocks
        int masterClock = 0;

        // Print the initial system clocks
        System.out.print("System clocks: ");
        for (int clock : systemClocks) {
            System.out.print(clock + " ");
        }
        System.out.println();

        // Calculate the average system clock
        int sum = 0;
        for (int clock : systemClocks) {
            sum += clock;
        }
        int averageClock = sum / systemClocks.length;

        // Store the time differences of each clock from the average
        ArrayList<Integer> timeDifferences = new ArrayList<>();
        for (int clock : systemClocks) {
            timeDifferences.add(averageClock - clock);
        }

        // Calculate the time adjustment for the master clock
        int timeAdjustment = 0;
        for (int difference : timeDifferences) {
            timeAdjustment += difference;
        }
        timeAdjustment /= timeDifferences.size();  // Average time difference

        // Update the master clock based on the calculated time adjustment
        masterClock = averageClock - timeAdjustment;

        // Print the updated system clocks
        System.out.print("Updated system clocks: ");
        for (int clock : systemClocks) {
            System.out.print((clock - timeAdjustment) + " ");
        }
        System.out.println();

        // Print the final master clock time
        System.out.println("Master clock: " + masterClock);
    }
}
