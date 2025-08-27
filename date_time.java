import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Question1 {
    public static void main(String[] args) {
      //-------- Problem - 1 ----------
        Scanner scanner = new Scanner(System.in);
        LocalTime ctime = LocalTime.now();
        System.out.println("Current Time: " + ctime);
        ZonedDateTime ctime2=ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Current Time in GMT: " + ctime2);
        ZonedDateTime ctime3=ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println(ctime3);

       //-------- Problem - 2 ----------
        
        System.out.println("enter date format:dd-mm-yyyy");
        String s=sc.nextLine();
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date=LocalDate.parse(s,f);
        System.out.println("current date"+date);
        LocalDate pdate=date.plusDays(15);
        System.out.println("date afteer 15 days addition"+pdate);
        LocalDate mdate=date.plusMonths(5);
        System.out.println("date after addition 5 months"+mdate);

       //-------- Problem - 3 ----------
       //  DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");
       DateTimeFormatter f2=DateTimeFormatter.ofPattern("yyyy-MM-dd");
       // String s=sc.nextLine();
       String s1=sc.nextLine();
       // LocalDate l1=LocalDate.parse(s,f);
       LocalDate l2=LocalDate.parse(s1,f2);
        //System.out.println(l1);
        System.out.println(l2);

       //-------- Problem - 4 ----------
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        LocalDate d1=LocalDate.parse(s1,f);
        LocalDate d2=LocalDate.parse(s2,f);
        System.out.println(d1.isBefore(d2));
        System.out.println(d1.isAfter(d2));
        System.out.println(d1.isEqual(d2));
    }
}
