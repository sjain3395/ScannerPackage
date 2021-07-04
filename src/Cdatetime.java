import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Cdatetime {
    public static void main(String[] args){
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        System.out.println("...........");

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        System.out.println("...........");


        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);

    }
}
