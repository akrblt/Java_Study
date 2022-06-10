package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler);//[Aykut, Yusuf, Ilker, Oguzhan]

        // remove (istenenObject) methodu istenen elementi kaldirip
        // bize true/ false doner.
        // eger remove isleminin yapildigini kontrol etmek istiyorsaniz
        // method u boolean bir variable a atayabilirsiniz
       boolean sonuc= isimler.remove("Oguzhan");// true git oguzhani bul ve yoket


         // sonucu kullaniciya yazdirmak isterseniz
        // if/else ile istediginiz degerlendirmeyi yazabilirsiniz
        if(sonuc==true){
            System.out.println("Istediginiz isim silindi");
        }else
            System.out.println("Istediginiz isim listede olmadigindan silinemedi.");

        System.out.println(isimler);//[Aykut, Yusuf, Ilker]

        sonuc=isimler.remove("Berk");

        if(sonuc==true){
            System.out.println("Istediginiz isim silindi");
        }else
            System.out.println("Istediginiz isim listede olmadigindan silinemedi.");// Berk listede olm icin else calisti

        // remove(index) yazdigimizda sildim/silmedim ihtimali olmaz
        // bize remove edilen elemeti verir
        System.out.println(isimler.remove(1));// Yusuf u siler ve
                                                    // delil olarak Yusuf ismini dondurur
        // yazdirsak da yazdirmasak da liste degisti ve 1. index deki elemani sildi
        System.out.println(isimler); //[Aykut, Ilker]
    }
}
