import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateandTime {
    public static void main(String[] args){
        LocalDate today=LocalDate.now();
        System.out.println(today);
        LocalTime time=LocalTime.now();
        System.out.println(time);
    }
}
