
public class DigitalWatchSimulation {
    public static void main(String[] args) {
        System.out.println("--- Digital Watch Simulation Started ---");

        // Outer loop: ye loop hour ke liye hai
        for (int hours = 0; hours < 24; hours++) {
            
            // Inner loop: ue loop minutes ke liye hai 
            for (int minutes = 0; minutes < 60; minutes++) {
                System.out.printf("%02d:%02d%n", hours, minutes);//print each time untill we get power cut

                // Scenario: Power cut at 13:00
                if (hours == 13 && minutes == 0) {
                    System.out.println("POWER CUT! Watch stopped at 13:00.");
                    return;
            }
        }
    }
}
}