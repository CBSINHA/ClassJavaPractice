import java.time.LocalDateTime;
import java.time.ZonedDateTime;
public class Localdateandtime1 {
    public static void main(String []args){
        LocalDateTime timeanddatenow=LocalDateTime.now();
        System.out.println(timeanddatenow);
        ZonedDateTime zone=ZonedDateTime.now();
        System.out.println(zone);
    }
}
