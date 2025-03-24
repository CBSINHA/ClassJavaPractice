import java.time.*;
import java.time.format.*;
public class DateTimeFOrmatterandParsing {
    public static void main(String[] args) {
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-dd-MM");
        System.out.println(LocalDate.now().format(formatter));
        LocalDate parsedDate=LocalDate.parse("2022-03-12",formatter);
        System.out.println(parsedDate);
    }
}
