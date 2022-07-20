package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {
    public static void main(String[] args)  {
        /*

        Bir kod yazilirken olasi exception`lar pngorulup exception olustugunda Jana`nin ne yapmasini
        istedigimiz belirtilmelidir.

        1=> Eger exception olustugunda kodun calismaya devam etmesini istemiyorsak method isminin yanina olusabilecek exception`u
        deklare ederiz
        2-)Eger exception olsun ama kod calismaya devam etsin istiyorsak try catch in icine aliriz.
         */
        String dosyaYolu="src/day41_exceptions/dosya";

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {// bir hata olsa dahi code calismaya devam eder
            e.printStackTrace();
        }

    }
}
