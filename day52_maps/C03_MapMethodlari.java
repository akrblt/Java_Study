package day52_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_MapMethodlari {
    public static void main(String[] args) {
        Map<String,Integer> myMap=new HashMap<>();
        myMap.put("H",3);
        myMap.putIfAbsent("K",5);
        System.out.println(myMap);//{H=3, K=5}
        // bir ekleme yapmak istedigimizde Key daha once eklenmemisse map`e eklensn
        //daha onceden eklenmmisse , eskiyi silmemek icin bizi uyarsin

        System.out.println(myMap.putIfAbsent("A",6));//null
        if(myMap.putIfAbsent("K",20)!=null){
            System.out.println("Girdiginiz key mapte zaten var");
        }
       // System.out.println(myMap.putIfAbsent("K",20));//5
        System.out.println(myMap);//{A=6, H=3, K=5} A`yi ekledi K`yi eklemedi.Delil olarak K`nin eski degerini getirdi

        myMap.put("A",10);
        System.out.println(myMap);//{A=10, H=3, K=5} A 6 idi 10 oldu

        myMap.compute("A",(key,value)->20);
        System.out.println(myMap);//{A=20, H=3, K=5} A`yi 20 yapti

        myMap.computeIfAbsent("A",v->30);
        System.out.println(myMap);//{A=20, H=3, K=5} A`yi degistirmedi

        // H`nin  degerini 2 katinin 5 fazlasi yapalim

        myMap.compute("H",(key,value)->(2*value+5));
        System.out.println(myMap);//{A=20, H=11, K=5} H`nin degeri 3 tu 11 oldu

    }
}
