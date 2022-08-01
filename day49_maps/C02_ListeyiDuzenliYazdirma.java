package day49_maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_ListeyiDuzenliYazdirma {
    public static void main(String[] args) {
        // Sinif listesini duzenli bir sekilde yazdirmak
        Map<Integer,String> sinif=MapOlustur.myMap();
        System.out.println(sinif);//{101=Ali,Can,Dev, 102=Veli,Yan,QA, 103=Ali,Yan,Dev}

        sinifListYazdir(sinif);
    }

    public static void sinifListYazdir(Map<Integer, String> sinif) {
        System.out.println("Numara  Isim  Soyisim  Brans");
        System.out.println("==========================");

        //Map yapisinda yazdirdigimizda kullanicilar bir sey anlamayabilir
        // bunun icin once map yapisini kodlarla manupule edip
        // map`deki datalari , istedigimiz formata sokmamiz gerekir
        // 1. adim key ve valueleri map`den alip
        // iki farkli collection uyesi atadik
        Set<Integer> keySet=sinif.keySet();
        Collection<String> valueSet=sinif.values();
        System.out.println(keySet);//[101, 102, 103]
        System.out.println(valueSet);//[Ali,Can,Dev, Veli,Yan,QA, Ali,Yan,Dev]
        System.out.println(valueSet.size());//3
        for (String each:valueSet
             ) {
            System.out.println(each);//Ali,Can,Dev
                                     //Veli,Yan,QA
                                      //Ali,Yan,Dev

        }
    }
}
