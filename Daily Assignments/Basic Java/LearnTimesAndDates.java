import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LearnTimesAndDates {
    // Good morning everyone! Today we're going to go over the use of times and
    // dates in Java. To do this, we'll be using LocalDate, LocalTime, and
    // LocalDateTime.
    // We will also go over how to format our dates/times and compare them. Let's
    // get started.

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateAndTime = LocalDateTime.now();
        System.out.println(dateAndTime);

        // Each of these print out date, time, and date/time respectively. We can now
        // format to make it more readable.

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String formattedDateTime = dateAndTime.format(dateFormat);
        System.out.println(formattedDateTime + " This is the formatted date and time.");

        // Now that we know format. Let's get the specific date and time of Christmas,
        // 2024.

        LocalDateTime christmas2024 = LocalDateTime.of(2024, 12, 25, 0, 1, 0);
        System.out.println(christmas2024 + " This is one minute after christmas last year.");

        // Finally, let's compare dates and times.
        LocalDateTime christmas2025 = LocalDateTime.of(2025, 12, 25, 0, 1, 0);

        if (christmas2025.isAfter(christmas2024)) {
            System.out.print(christmas2025 + " is after Christmas of 24" + christmas2024);
        }
        ;
    }
}
