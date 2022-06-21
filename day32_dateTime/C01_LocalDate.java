package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate trh=LocalDate.now();// objenin olusturuldugu tarihi teh`ye atar

        LocalDate baskaTrh=LocalDate.of(1992,6,24);

        // istedigimiz yil ay ve gun degerlerine gore bize obje olusturur

        System.out.println(trh); //2022-03-31
        System.out.println(baskaTrh);//1992-06-24


        //get `li methodlarla tarih ile ilgili detay bilgileri alabiliriz
        System.out.println(trh.getDayOfMonth());//31
        System.out.println(trh.getDayOfWeek());//THURSDAY
        System.out.println(trh.getMonthValue());//3
        System.out.println(trh.getDayOfYear());//90

        // bir tarihten istedigimiz kadar ileri veya geri gidebiliriz

        System.out.println(trh.minusWeeks(20));//2021-11-11 20 hafta once hangi gun
        System.out.println(trh.plusWeeks(20));//2022-08-18 20 hafta sonra
        System.out.println(trh.plusYears(1).plusMonths(1).plusWeeks(1).plusDays(1));//2023-05-08

        // istedigimiz ulkenin o andaki tarihini elde etmek istersek

        System.out.println(LocalDate.now().isLeapYear());//2023-05-08

        LocalDate trhZone=LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone);//2022-04-01 japonya da 1 nisan olmus

        // is ile baslayan methodlar boolean sonuc dondurur

        System.out.println(trh.isAfter(baskaTrh));//true

    }
}
