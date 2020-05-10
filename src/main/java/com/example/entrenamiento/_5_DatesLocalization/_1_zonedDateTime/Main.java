package com.example.entrenamiento._5_DatesLocalization._1_zonedDateTime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {



    /*    System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());*/

        LocalDate localDate = LocalDate.of(2020, Month.APRIL,28);
        LocalDate localDate2 = LocalDate.now();
        System.out.println(localDate.isAfter(localDate2));
        Period period = Period.ofDays(2);
        period =period.plusMonths(30);
        System.out.println(period);
        System.out.println(localDate.plusDays(10));

        Duration duration = Duration.of(10,ChronoUnit.MINUTES);
        duration = duration.plusHours(60);
        System.out.println(duration);
        LocalTime localTime = LocalTime.of(10,23);


        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);
        System.out.println(localDateTime);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime,ZoneId.of("America/Lima"));
        System.out.println(zonedDateTime);
        System.out.println(ChronoUnit.DAYS.between(localDate,localDate2));
       // ZoneId.getAvailableZoneIds().forEach(x-> System.out.println(x));
        //ZonedDateTime zonedDateTime = ZonedDateTime.of(dateandTie,ZoneId.of("Australia/West"));
        //ChronoUnit.MINUTES.between(LocalTime.now(),LocalDateTime.now()));

    }
}