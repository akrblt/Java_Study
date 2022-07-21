package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {
    public static void main(String[] args) {


        String dosyaYolu="src/day41_exceptions/dosya";

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            int k=0;
            while( (k=fis.read())!=-1) {
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

          /*
        Exception'lar icin de parent child iliskisi mevcuttur
        Eger bir kod icin birden fazla exeption olusma ihtimali varsa
        Oncelikle olasi exception'lar parent-child iliskisi tasiyor mu bakmamiz gerekir
        Eger parent child iliskisi yoksa, istedigimiz sirada catch cumleleri olusturabiliriz
        Eger Parent child iliskisi varsa
        sadece parent exception'i yazabiliriz
        veya ikisini de yazmak istersek
        child'i once parent'i sonra yazmaliyiz
         */





        /*
        Alyi kirmizi cizgili her kod cte degildir.
        Java syntax hatalarini compile da fark eder ve altini cizer
        biz bugune kadar hepsine cte diyorduk
        Compile Time Exception kavramini tanimis oluyoruz.
         */

    }
}
