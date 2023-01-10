package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {

    public static void main(String[] args) {

        Date myDate = new Date();
        System.out.println(myDate);// Sat Jan 07 15:28:06 EST 2023
        System.out.println(myDate.getTime());// 1673123407075 ==> 1 Ocak 1970 den su ana kadar ki mili saniye miktari

        //Icinde bulundugumuz an nasil alinir?
        System.out.println(LocalDate.now());// 2023-01-07

        System.out.println(LocalTime.now());// 15:36:10.482639

        System.out.println(LocalDateTime.now());//2023-01-07T15:37:42.704739

        //Dunyanin herhangi bir saat dilimindeki saati nasil aliriz?
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Vienna")));//2023-01-07T21:45:21.219860
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));//2023-01-08T05:46:06.936254
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Moscow")));//2023-01-07T23:47:36.378333

        //Ileriki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));// 2030-07-12

        //Geriki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));//2018-10-05

        //Ileriki bir zamana nasil gidilir?
        System.out.println(LocalTime.now().plusHours(3));//18:57:57.125199

        //Geriki bir tarihe nasil gidilir?
        System.out.println(LocalTime.now().minusMinutes(45));//15:14:36.799331

        //Zaman'da belli bir bolumu nasil aliriz?
        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());// 16:2

        //Tarih'de belli bir bolumu nasil aliriz?
        System.out.println(LocalDate.now().getMonthValue() + ":" + LocalDate.now().getDayOfMonth());// 1:7

        //Iki tarih nasil karsilastirlir?
        // 02/13/2005 - 03/01/2007
        boolean result = LocalDate.of(2005, 02, 13).isAfter(LocalDate.of(2007,03,01));
        System.out.println(result);//false

        //Tarih'lerin formatlari nasil degistirilir?
        //M-->Tek rakamla ay  no'sunu yazar - MM--> Iki rakamla ay no'sunu yazar
        //MMM-->Ay isminin ilk uc harfini yazar  -  MMMM-->Ay isminin tamamini yazar

        //d-->Tek rakamla gun no'sunu yazar   -   dd-->Iki rakamla gun no'sunu yazar

        //yy-->Yilin son iki rakamini yazar   -   yyyy--> Yilin tamamini yazar
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy");

        System.out.println(dtf.format(LocalDate.now()));//07/01/2023
    }
}