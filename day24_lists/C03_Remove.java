package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {
        List<Integer> sayilar= new ArrayList<>();

        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(0,7);
        sayilar.add(2,7);

        sayilar.remove(3);// index olarak 3 teli elementi siler
       // sayilar.remove(5); //.IndexOutOfBoundsException
        /*
        Sayilardan olusan bir List`te objeyi verek element silme methodu calismaz
        sayi degeri girdigimizde Java otomatik olarak sayiyi index kabul eder.
         */

       // int sayi=5;
      //  sayilar.remove(sayi);  // primitive oldugu icin calismaz
        Integer sayi=5; // obje old ( non primitive) icin calisir
        sayilar.remove(sayi);
        System.out.println(sayilar);//[7, 7]
        // sayilar.remove(Integer.valueOf("5"));// Boyle de olur. Biraz uzun va zahmetli bir yontem
    }
}
