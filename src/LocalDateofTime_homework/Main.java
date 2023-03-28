package LocalDateofTime_homework;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    /*
    Получить и вывести на экран:
   * -текущую дату
   * -текущий год, месяц и день
   * Создать дату , например день рождения и вывести на экран
   * Создать две даты и проверить на равенство
   * Получить и вывести на экран текущее время
   * текущее время + 3 часа
   * Создать дату на неделю позже сегодняшней
   * Создать дату, которая была на год раньше сегодняшней используя метод minus
   * Создать дату на год позже сегодняшней используя plus метод
   * Создать даты tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
   * Написать метод, принимающий лист из нескольких дат типа LocalDate
     и возвращающий количество дней между самой ранней и поздней датами
     */
    public static  void main(String[] args) {


       LocalDate today = LocalDate.now();
        System.out.println("today is: "+today); //-> today is: 2023-03-27

        //----------------------------------------------------------------\\

       LocalDate date = LocalDate.of(2023,03,27);
       System.out.println("Today is " + date); //-> Today is 2023-03-27

        //--------------------------------------------------------------------\\

        LocalDate dateParse = LocalDate.parse("2005-02-05");
        System.out.println("Date of receipt of the driver's license: "+dateParse);
        //output->    Date of receipt of the driver's license: 2005-02-05

        //------------------------------------------------------------------------------\\

        LocalDate date1 = LocalDate.of(2020,10,20);
        LocalDate date2 = LocalDate.of(2020,05,15);

        System.out.println("date1 is != date2: " +date1.equals(date2)); //->  date1 is != date2: false

        //------------------------------------------------------------------------------------------------\\

        LocalTime time = LocalTime.now();
        System.out.println("time is : "+time); // -> time is : 08:36:56.120904100

        //--------------------------------------------------------------------------------------------------\\

        LocalTime timeNow = LocalTime.now().plusHours(3);
        System.out.println("Time now plus 1 hour is: "+timeNow); //Time now plus 1 hour is: 11:46:51.341426400

        //------------------------------------------------------------------------------------------------------\\

        LocalDate nextWeek = LocalDate.now().plusWeeks(1);
        System.out.println("Next week: "+nextWeek); // Next week: 2023-04-24

        //---------------------------------------------------------------------------------------------------\\

        LocalDate lastYear = LocalDate.now().minusYears(1);
        System.out.println("Last year : "+lastYear); //Last year : 2022-03-28

        //------------------------------------------------------------------------------------\\

        LocalDate nextYear = LocalDate.parse("2023-03-28").plusYears(1);
        System.out.println("Next year: " +nextYear); //Next year: 2024-03-28

        //---------------------------------------------------------------------------\\

        boolean tomorrow = LocalDate.now().isBefore(LocalDate.parse("2023-03-29"));
        boolean yesterday = LocalDate.now().isAfter(LocalDate.parse("2020-03-27"));

        System.out.println(tomorrow); // true
        System.out.println(yesterday); // true

        //----------------------------------------------------------------------------\\





















//  DayofMonth day = LocalDate.of(2023,03,27).getDayOfMonth();
        //  System.out.println("Today is "+day); //Today is MONDAY









    }

}
