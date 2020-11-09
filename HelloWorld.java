
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.Period;


public class HelloWorld 
{
 
       public static void main (String[] args)
       {
             LocalDate date_UoC_imma = LocalDate.of(2010, 10, 1);
             LocalDate date_now = LocalDate.now();
             
             Period university_time = date_UoC_imma.until(date_now);
             
             
             System.out.format("Matriculated since %d years, %d month. %n", university_time.get(ChronoUnit.YEARS),university_time.get(ChronoUnit.MONTHS));
       }
}
