package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasiniBulma {
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(1992,06,24);
        System.out.println(Period.between(dogumGunu,bugun));//P29Y9M7D

        System.out.println(Period.between(dogumGunu,bugun).getDays());//7 Gunler arsindaki fark
        System.out.println(Period.between(dogumGunu,bugun).getYears());//29

    }
}
