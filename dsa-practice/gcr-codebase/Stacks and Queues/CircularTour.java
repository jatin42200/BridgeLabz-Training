public class CircularTour {
    public static int findStartingPump(int[] petrol, int[] distance) {
        int n = petrol.length;
        int start = 0;          // Starting point candidate
        int current_petrol = 0; // Current balance for the tour
        int total_surplus = 0;  // Overall balance (petrol - distance)

        for (int i = 0; i < n; i++) {
            int diff = petrol[i] - distance[i];
            total_surplus += diff;
            current_petrol += diff;

            // Agar petrol khatam ho gaya, toh pichle pumps start nahi ho sakte
            if (current_petrol < 0) {
                start = i + 1;      // Agle pump se koshish karo
                current_petrol = 0; // Reset balance
            }
        }

        // Agar total petrol total distance se zyada hai, toh rasta possible hai
        return (total_surplus >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int startIndex = findStartingPump(petrol, distance);

        if (startIndex == -1) {
            System.out.println("Koi rasta possible nahi hai.");
        } else {
            System.out.println("Starting Petrol Pump Index: " + startIndex);
        }
    }
}