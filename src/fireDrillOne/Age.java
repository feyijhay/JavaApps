package fireDrillOne;

import java.time.LocalDate;
import java.time.Period;

public class Age {
    public int getAge(String[] date){

   LocalDate year = LocalDate.now();
   LocalDate currentDate = LocalDate.of(2022, 01,01);
   Period period = Period.between(currentDate,year);

   int years = period.getYears();
   int month = period.getMonths();
   int day = period.getDays();

   return years + month + day;
    }

}
