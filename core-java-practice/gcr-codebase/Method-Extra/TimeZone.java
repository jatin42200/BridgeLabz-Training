
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZone {    public static void main(String[] args) {
        // Create a formatter to make the output readable
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

        // 1. GMT (Greenwich Mean Time)
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        
        // 2. IST (Indian Standard Time)
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        
        // 3. PST (Pacific Standard Time)
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // Display the results
        System.out.println("Current Time in Different Time Zones:");
        System.out.println("------------------------------------");
        System.out.println("GMT: " + gmtTime.format(formatter));
        System.out.println("IST: " + istTime.format(formatter));
        System.out.println("PST: " + pstTime.format(formatter));
    }
}