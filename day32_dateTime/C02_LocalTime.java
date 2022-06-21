package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        LocalTime tm=LocalTime.now();
        System.out.println(tm);//21:09:47.150080500

        int sayi=0;
        for (int i = 0; i <100000 ; i++) {
            sayi+=i;

        }
        System.out.println(sayi);
        LocalTime bitirince=LocalTime.now();
        System.out.println(bitirince);

        // eger islemi ne kadar surede yaptigini gormek istersek iki farkli LocalDate olusturmamiz gerekir.
        // islemden once ve sonra birer time objesi olusturup hesaplayabiliriz

        double nano1=tm.getNano();
        double nano2=bitirince.getNano();
        System.out.println("Islem "+(nano2-nano1)+" nano saniyede bitti");

        // ileri veya geriye gidebiliriz
        System.out.println(tm.plusMinutes(1000));// Bir dak sonra 13:59:52.758321
       // istersek zone id kullanarak istedigimiz bolgenin saati icin de obje olusturabiliriz.
    }
}
