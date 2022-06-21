package day32_dateTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihsaat=LocalDateTime.now();
        System.out.println(tarihsaat);//2022-03-31T21:35:42.754486700

        System.out.println(tarihsaat.plusYears(3).plusMonths(2).plusWeeks(2).plusDays(3).plusHours(5).plusMinutes(30));//2025-06-18T03:07:47.674376600
    }
}
