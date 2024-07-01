package DateTime;

import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Date {
    public static <SimpleDateFormat> void main(String[] args) {

        // 1. Create a LocalDate instance for today's date
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        // 2. Create a LocalDate instance for your birthday
        LocalDate birthday = LocalDate.of(1996, 3, 01);
        System.out.println("My birthday: " + birthday);

        // 3. Add 10 days to a LocalDate instance and print the result
        LocalDate futureDate = today.plusDays(10);
        System.out.println("Date after 10 days: " + futureDate);

        // 4. Convert a LocalDate to a string in the format "dd-MM-yyyy"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = today.format(formatter);
        System.out.println("Formatted date: " + formattedDate);

        // 5. Parse a date string "2023-08-15" into a LocalDate instance
        LocalDate parsedDate = LocalDate.parse("2023-08-15");
        System.out.println("Parsed date: " + parsedDate);

        // 6. Determine the day of the week for a given LocalDate
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        System.out.println("Day of the week: " + dayOfWeek);

        // 7. Create a LocalDateTime instance for a specific date and time (e.g., 2022-12-25 10:30)
        LocalDateTime specificDateTime = LocalDateTime.of(2022, 12, 25, 10, 30);
        System.out.println("Specific date and time: " + specificDateTime);

        // 8. Add 5 hours to a LocalDateTime instance and print the result
        LocalDateTime newDateTime = specificDateTime.plusHours(5);
        System.out.println("Date and time after 5 hours: " + newDateTime);

        // 9. Extract and print the date part of a LocalDateTime instance
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDate datePart = dateTime.toLocalDate();
        System.out.println("Date part: " + datePart);

        // 11. Format a LocalDateTime instance into a string "yyyy-MM-dd HH:mm"
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedDateTime = dateTime.format(dateTimeFormatter);
        System.out.println("Formatted date-time: " + formattedDateTime);

        // 12. Parse a date-time string "2023-08-15T14:30:00" into a LocalDateTime instance
        LocalDateTime parsedDateTime = LocalDateTime.parse("2023-08-15T14:30:00");
        System.out.println("Parsed date-time: " + parsedDateTime);

//        // 13. Parse a Date instance from the string "2024-06-26 12:30:45"
//        String dateString = "2024-06-26 12:30:45";
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date parsedDateInstance = null;
//        try {
//            parsedDateInstance = dateFormat.parse(dateString);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Parsed Date: " + parsedDateInstance);

//        // 14. Convert a Date instance to LocalDate
//        LocalDate localDate = Instant.ofEpochMilli(parsedDateInstance.getTime())
//                .atZone(ZoneId.systemDefault())
//                .toLocalDate();
//        System.out.println("Converted LocalDate: " + localDate);

//        // 15. Convert a Date instance to LocalDateTime
//        java.util.Date parsedDateInstance;
//        LocalDateTime localDateTime = Instant.ofEpochMilli(parsedDateInstance.getTime())
//                .atZone(ZoneId.systemDefault())
//                .toLocalDateTime();
//        System.out.println("Converted LocalDateTime: " + localDateTime);

        // 16. Convert a LocalDateTime instance to Date
        Instant localDateTime;
       // Date dateFromLocalDateTime = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
       // System.out.println("Converted Date from LocalDateTime: " + dateFromLocalDateTime);

        // 17. Calculate the number of days between two LocalDate instances: "2024-06-26" and "2023-06-26"
        LocalDate date1 = LocalDate.of(2024, 6, 26);
        LocalDate date2 = LocalDate.of(2023, 6, 26);
        long daysBetween = ChronoUnit.DAYS.between(date2, date1);
        System.out.println("Number of days between: " + daysBetween);

        // 18. Calculate the number of hours between two LocalDateTime instances: "2024-06-26T12:30:45" and "2024-06-25T12:30:45"
        LocalDateTime dateTime1 = LocalDateTime.of(2024, 6, 26, 12, 30, 45);
        LocalDateTime dateTime2 = LocalDateTime.of(2024, 6, 25, 12, 30, 45);
        long hoursBetween = ChronoUnit.HOURS.between(dateTime2, dateTime1);
        System.out.println("Number of hours between: " + hoursBetween);

    }
}